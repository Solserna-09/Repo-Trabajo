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


public class PedidoBusquedaStepDefinition {

    @Before
    public void setStage() { setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario se encuentra logueado en la pagina \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void queElUsuarioSeEncuentraLogueadoEnLaPagina(String url, String correo, String clave, String destinatario) {
        theActorCalled("Test").wasAbleTo(Open.url(url));
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesionTask.onThePage(correo,clave));
        OnStage.theActorInTheSpotlight().attemptsTo(DestinatarioBusquedaTask.onThePage(destinatario));
        //OnStage.theActorInTheSpotlight().attemptsTo(ValidarInicioSesion.onThePage());


    }

    @Cuando("^el usuario busque los productos por codigo para agregarlos al carro de compras \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void elUsuarioBusqueLosProductosPorCodigoParaAgregarlosAlCarroDeCompras(String cantidad, String producto, String segundoProducto, String segundaCantidad, String numeroOrdenCompra, String ObservacionOrdenCompra) {
        OnStage.theActorInTheSpotlight().attemptsTo(ValidarCamposVacios.onThePage(cantidad,producto,segundoProducto, segundaCantidad));
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoTask.onThePage(cantidad, producto, segundoProducto, segundaCantidad));
        OnStage.theActorInTheSpotlight().attemptsTo(OrdenTask.onThePage(numeroOrdenCompra,ObservacionOrdenCompra));
    }

    @Cuando("^lo consulte el pedido para cancelarlo$")
    public void loConsulteElPedidoParaCancelarlo() {
        OnStage.theActorInTheSpotlight().attemptsTo(CancelarPedidoTask.onThePage());
        OnStage.theActorInTheSpotlight().should(seeThat("No se visualiza el pedido", ValidarNumeroPedido.validarMensaje(), Matchers.equalTo(true)));
        OnStage.theActorInTheSpotlight().should(seeThat("No se visualiza el Estado", ValidarEstadoPedido.validarMensaje(), Matchers.equalTo(true)));

    }

    @Entonces("^el podra visualizara un mensaje de Cancelado por cliente$")
    public void elPodraVisualizaraUnMensajeDeCanceladoPorCliente() {
        GivenWhenThen.seeThat(WebElementQuestion.the(LBL_VALIDAR_ESTADO_PEDIDO),
                WebElementStateMatchers.containsOnlyText("Cancelado por cliente"));

    }







}
