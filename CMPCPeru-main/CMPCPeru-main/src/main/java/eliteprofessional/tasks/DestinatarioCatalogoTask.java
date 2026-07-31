package eliteprofessional.tasks;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static eliteprofessional.userinterfaces.DestinatarioUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class DestinatarioCatalogoTask implements Task {

    String destinatario;

    public DestinatarioCatalogoTask(String destinatario) {
        this.destinatario = destinatario;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {




        if(destinatario==""){

        }else {
            actor.attemptsTo(
                    Enter.theValue(destinatario).into(TXT_BUSCAR_DESTINA),
                    Click.on(BTN_SELECCIONAR),
                    WaitUntil.the(BTN_CAMBIAR_DESTINATARIO, isClickable()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_CAMBIAR_DESTINATARIO)


            );
        }

    }
    public static DestinatarioCatalogoTask onThePage(String destinatario) {
        return Instrumented.instanceOf(DestinatarioCatalogoTask.class).withProperties(destinatario);

    }
}