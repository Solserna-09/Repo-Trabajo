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

public class PedidoProductosStepDefinition {

    @Before
    public void setStage() { setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario se encuentra logueado \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void queElUsuarioSeEncuentraLogueado(String url, String correo, String clave) {
        theActorCalled("Test").wasAbleTo(Open.url(url));
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesionTask.onThePage(correo, clave));
        //OnStage.theActorInTheSpotlight().attemptsTo(ValidarInicioSesion.onThePage());

    }

    @Dado("^en la opcion mis productos \"([^\"]*)\"$")
    public void enLaOpcionMisProductos(String destinatario) {
        OnStage.theActorInTheSpotlight().attemptsTo(DestinatarioTask.onThePage(destinatario));
        OnStage.theActorInTheSpotlight().attemptsTo(MisProductosTask.onThePage());
    }

    @Cuando("^el adicione los productos al carro para completar la informacion de pago \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void elAdicioneLosProductosAlCarroParaCompletarLaInformacionDePago(String cantidad, String producto, String segundoProducto, String segundaCantidad, String numeroOrdenCompra, String observacionOrdenCompra) {
        OnStage.theActorInTheSpotlight().attemptsTo(ValidarCamposVacios.onThePage(cantidad,producto,segundoProducto, segundaCantidad));
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductoTask.onThePage(cantidad,producto,segundoProducto, segundaCantidad));
        OnStage.theActorInTheSpotlight().attemptsTo(OrdenTask.onThePage(numeroOrdenCompra,observacionOrdenCompra));
    }

    @Cuando("^consulte el pedido para cancelarlo$")
    public void consulteElPedidoParaCancelarlo() {
        OnStage.theActorInTheSpotlight().attemptsTo(CancelarPedidoTask.onThePage());
        OnStage.theActorInTheSpotlight().should(seeThat("No se visualiza el pedido", ValidarNumeroPedido.validarMensaje(), Matchers.equalTo(true)));
        OnStage.theActorInTheSpotlight().should(seeThat("No se visualiza el Estado", ValidarEstadoPedido.validarMensaje(), Matchers.equalTo(true)));

    }

    @Entonces("^el visualizara un mensaje de Cancelado por cliente$")
    public void elVisualizaraUnMensajeDeCanceladoPorCliente() {
        GivenWhenThen.seeThat(WebElementQuestion.the(LBL_VALIDAR_ESTADO_PEDIDO),
                WebElementStateMatchers.containsOnlyText("Cancelado por cliente"));
    }

    }











