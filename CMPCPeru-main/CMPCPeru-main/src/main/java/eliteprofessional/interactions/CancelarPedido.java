package eliteprofessional.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static eliteprofessional.userinterfaces.EstadoPedidoUI.*;

public class CancelarPedido implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
           String Estado = LBL_VALIDAR_ESTADO_PEDIDO.resolveFor(actor).getText();
           Boolean estado = false;
        do {
            Estado = LBL_VALIDAR_ESTADO_PEDIDO.resolveFor(actor).getText();
            switch (Estado) {
                case "Análisis de crédito":
                    BrowseTheWeb.as(actor).getDriver().navigate().refresh();
                    break;
                case "En proceso":
                    BrowseTheWeb.as(actor).getDriver().navigate().refresh();
                    break;
                default:
                     estado = true;
            }
        } while (!estado.equals(true));

      }


    public static CancelarPedido onThePage(){
        return Instrumented.instanceOf(CancelarPedido.class).withProperties();
    }
}
