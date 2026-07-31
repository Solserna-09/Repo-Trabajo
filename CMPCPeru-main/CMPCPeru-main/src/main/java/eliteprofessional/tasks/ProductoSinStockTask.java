package eliteprofessional.tasks;


import eliteprofessional.interactions.EsperaImplicita;
import eliteprofessional.interactions.SeleccionarFecha;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static eliteprofessional.userinterfaces.PagarUI.*;
import static eliteprofessional.userinterfaces.PaginaInicioUI.BTN_MIS_PRODUCTOS;
import static eliteprofessional.userinterfaces.ProductosSinStockUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class ProductoSinStockTask implements Task {
    String segundoProducto;
    String segundaCantidad;
    String numeroOrdenCompra;
    String observacionOrdenCompra;


    public ProductoSinStockTask(String segundoProducto, String segundaCantidad, String numeroOrdenCompra, String observacionOrdenCompra) {
        this.segundoProducto = segundoProducto;
        this.segundaCantidad = segundaCantidad;
        this.numeroOrdenCompra = numeroOrdenCompra;
        this.observacionOrdenCompra = observacionOrdenCompra;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_MIS_PRODUCTOS),
                Enter.keyValues(segundaCantidad).into(TXT_CANTIDAD_SEGUNDO_PRODUCTO.of(segundoProducto)),
                Click.on(BTN_AGREGA_CARRITO.of(segundoProducto)),
                Click.on(BTN_REVISAR_CARRITO_2),
                Click.on(BTN_FINALIZAR_PEDIDO),
                Check.whether(WebElementQuestion.stateOf(BTN_ACEPTAR_ALERTA),
                        WebElementStateMatchers.isVisible())
                        .andIfSo(JavaScriptClick.on(BTN_ACEPTAR_ALERTA))
                        .otherwise(),
                WaitUntil.the(BTN_CALENDARIO, isClickable()).forNoMoreThan(30).seconds(),
                Enter.theValue(numeroOrdenCompra).into(TXT_NUMERO_ORDEN),
                Enter.theValue(observacionOrdenCompra).into(TXT_OBSERVACION_ORDEN),
                Click.on(RDA_ACEPTO_TERMINOS),
                Click.on(BTN_CALENDARIO),
                WaitUntil.the(BTN_SIGUIENTE_CALENDARIO, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(BTN_SIGUIENTE_CALENDARIO),
                EsperaImplicita.enSegundos(5),
                SeleccionarFecha.on(),
                WaitUntil.the(BTN_REALIZAR_PEDIDOS, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(BTN_REALIZAR_PEDIDOS));


    }

    public static ProductoSinStockTask onThePage(String segundoProducto, String segundaCantidad,String numeroOrdenCompra, String observacionOrdenCompra) {
        return Instrumented.instanceOf(ProductoSinStockTask.class).withProperties(segundoProducto, segundaCantidad, numeroOrdenCompra, observacionOrdenCompra);}
}
