package eliteprofessional.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static eliteprofessional.userinterfaces.CatalogoUI.BTN_AGREGAR_CARRO;
import static eliteprofessional.userinterfaces.PedidosUI.BTN_REVISAR_CARRO;


public class FinalCatalogoTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(

                JavaScriptClick.on(BTN_AGREGAR_CARRO),
                Click.on(BTN_REVISAR_CARRO)


                );


    }

    public static FinalCatalogoTask onThePage() {
        return Instrumented.instanceOf(FinalCatalogoTask.class).withProperties();

    }

}
