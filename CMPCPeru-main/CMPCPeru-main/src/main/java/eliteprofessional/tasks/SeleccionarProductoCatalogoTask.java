package eliteprofessional.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static eliteprofessional.userinterfaces.CatalogoUI.*;
import static eliteprofessional.userinterfaces.PaginaInicioUI.*;


public class SeleccionarProductoCatalogoTask implements Task {
    String categoria;

    public SeleccionarProductoCatalogoTask(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_CATALOGO),
                Click.on(TXT_SELECCIONAR_CATEGORIA.of(categoria))




                );


    }

    public static SeleccionarProductoCatalogoTask onThePage(String categoria) {
        return Instrumented.instanceOf(SeleccionarProductoCatalogoTask.class).withProperties(categoria);}
}
