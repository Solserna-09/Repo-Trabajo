package eliteprofessional.tasks;


import eliteprofessional.interactions.CancelarPedido;
import eliteprofessional.interactions.EsperaExplicita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static eliteprofessional.userinterfaces.EstadoPedidoUI.*;


public class CancelarPedidoTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


            actor.attemptsTo(
                    Click.on(BTN_ORDENES),
                    Scroll.to(TBL_ESTADOS),
                    CancelarPedido.onThePage(),
                    Check.whether(WebElementQuestion.stateOf(BTN_CANCELAR_PEDIDO),
                            WebElementStateMatchers.isVisible())
                            .andIfSo(Click.on(BTN_CANCELAR_PEDIDO))
                            .otherwise(Click.on(BTN_CANCELAR_PEDIDO2)),
                    Check.whether(WebElementQuestion.stateOf(BTN_ACEPTO_CANCELAR),
                                    WebElementStateMatchers.isVisible())
                            .andIfSo(Click.on(BTN_ACEPTO_CANCELAR))
                            .otherwise(Click.on(BTN_ACEPTO_CANCELAR2)),
                    EsperaExplicita.enSegundos(10),
                    Scroll.to(LBL_VALIDAR_ESTADO_PEDIDO),
                    EsperaExplicita.enSegundos(5)
            );


    }
    public static CancelarPedidoTask onThePage() {
        return Tasks.instrumented(CancelarPedidoTask.class);
    }
}