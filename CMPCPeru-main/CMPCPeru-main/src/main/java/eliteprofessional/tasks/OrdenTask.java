package eliteprofessional.tasks;

import eliteprofessional.interactions.EsperaImplicita;
import eliteprofessional.interactions.SeleccionarFecha;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static eliteprofessional.userinterfaces.PagarUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class OrdenTask implements Task {

    String numeroOrdenCompra;
    String observacionOrdenCompra;

    public OrdenTask(String numeroOrdenCompra, String observacionOrdenCompra) {
        this.numeroOrdenCompra = numeroOrdenCompra;
        this.observacionOrdenCompra = observacionOrdenCompra;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


            actor.attemptsTo(
                    Click.on(BTN_FINALIZAR_PEDIDO),
                    Enter.theValue(numeroOrdenCompra).into(TXT_NUMERO_ORDEN),
                    Enter.theValue(observacionOrdenCompra).into(TXT_OBSERVACION_ORDEN),
                    Click.on(RDA_ACEPTO_TERMINOS),
                    WaitUntil.the(BTN_CALENDARIO, isClickable()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_CALENDARIO),
                    WaitUntil.the(BTN_SIGUIENTE_CALENDARIO, isClickable()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_SIGUIENTE_CALENDARIO),
                    EsperaImplicita.enSegundos(5),
                    SeleccionarFecha.on(),
                    WaitUntil.the(BTN_REALIZAR_PEDIDOS, isClickable()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_REALIZAR_PEDIDOS)




            );

    }
    public static OrdenTask onThePage(String numeroOrdenCompra, String ObservacionOrdenCompra) {
        return Instrumented.instanceOf(OrdenTask.class).withProperties(numeroOrdenCompra, ObservacionOrdenCompra);}
}