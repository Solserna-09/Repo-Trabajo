package eliteprofessional.questions;

import eliteprofessional.userinterfaces.EstadoPedidoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarEstadoPedido implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return EstadoPedidoUI.LBL_VALIDAR_ESTADO_PEDIDO.resolveFor(actor).isVisible();
    }

    public static Question validarMensaje(){
        return new ValidarEstadoPedido();
    }
}
