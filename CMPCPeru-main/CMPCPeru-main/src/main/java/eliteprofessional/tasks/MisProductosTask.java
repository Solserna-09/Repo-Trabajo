package eliteprofessional.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static eliteprofessional.userinterfaces.PaginaInicioUI.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class MisProductosTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


            actor.attemptsTo(
                    WaitUntil.the(BTN_MIS_PRODUCTOS, isClickable()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_MIS_PRODUCTOS)



            );

    }
    public static MisProductosTask onThePage() {
        return Tasks.instrumented(MisProductosTask.class);
    }
}