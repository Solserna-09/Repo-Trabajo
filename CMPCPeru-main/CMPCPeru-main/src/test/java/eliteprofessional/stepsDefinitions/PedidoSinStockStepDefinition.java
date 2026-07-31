package eliteprofessional.stepsDefinitions;


import eliteprofessional.questions.ValidarCamposVacios;
import eliteprofessional.questions.ValidarEstadoPedido;
import eliteprofessional.questions.ValidarNumeroPedido;
import eliteprofessional.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.hamcrest.Matchers;

import static eliteprofessional.userinterfaces.EstadoPedidoUI.LBL_VALIDAR_ESTADO_PEDIDO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PedidoSinStockStepDefinition {

    @Before
    public void setStage() { setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario inicie sesion \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void queElUsuarioInicieSesion(String url, String correo, String clave) {
        theActorCalled("Test").wasAbleTo(Open.url(url));
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesionTask.onThePage(correo,clave));
        //OnStage.theActorInTheSpotlight().attemptsTo(ValidarInicioSesion.onThePage());

    }

    @Dado("^este la opcion mis productos \"([^\"]*)\"$")
    public void esteLaOpcionMisProductos(String destinatario) {
        OnStage.theActorInTheSpotlight().attemptsTo(DestinatarioSinStockTask.onThePage(destinatario));

    }

    @Cuando("^seleccione los producto para revisar el carro de compras  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void seleccioneLosProductoParaRevisarElCarroDeCompras(String cantidad, String producto, String segundoProducto, String segundaCantidad, String numeroOrdenCompra, String observacionOrdenCompra) {
        OnStage.theActorInTheSpotlight().attemptsTo(ValidarCamposVacios.onThePage(cantidad,producto,segundoProducto, segundaCantidad));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProductoStockTask.onThePage(cantidad,producto));
        OnStage.theActorInTheSpotlight().attemptsTo(ProductoSinStockTask.onThePage(segundoProducto, segundaCantidad, numeroOrdenCompra, observacionOrdenCompra));
        OnStage.theActorInTheSpotlight().attemptsTo(CancelarPedidoTask.onThePage());
        OnStage.theActorInTheSpotlight().should(seeThat("No se visualiza el pedido", ValidarNumeroPedido.validarMensaje(), Matchers.equalTo(true)));
        OnStage.theActorInTheSpotlight().should(seeThat("No se visualiza el Estado", ValidarEstadoPedido.validarMensaje(), Matchers.equalTo(true)));
    }

    @Entonces("^el usuario visualizara un mensaje Ha seleccionado productos sin stock$")
    public void elUsuarioVisualizaraUnMensajeHaSeleccionadoProductosSinStock() {
        GivenWhenThen.seeThat(WebElementQuestion.the(LBL_VALIDAR_ESTADO_PEDIDO),
                WebElementStateMatchers.containsOnlyText("Cancelado por cliente"));

    }


}