package eliteprofessional.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import static eliteprofessional.userinterfaces.PaginaInicioUI.BTN_MIS_PRODUCTOS;


import static eliteprofessional.userinterfaces.ProductosSinStockUI.*;
import static eliteprofessional.userinterfaces.ProductosSinStockUI.BTN_REVISAR_CARRO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SeleccionarProductoStockTask implements Task {

    String producto;
    String cantidad;


    public SeleccionarProductoStockTask(String producto, String cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

          actor.attemptsTo(
                  WaitUntil.the(BTN_MIS_PRODUCTOS, isClickable()).forNoMoreThan(30).seconds(),
                  Click.on(BTN_MIS_PRODUCTOS),
                  WaitUntil.the(BTN_PRODUCTO_SIMILAR, isClickable()).forNoMoreThan(30).seconds(),
                  Click.on(BTN_PRODUCTO_SIMILAR),
                  WaitUntil.the(BTN_SALIR, isClickable()).forNoMoreThan(30).seconds(),
                  Click.on(BTN_SALIR),
                  Click.on(IMG_SIN_STOCK.of(producto)),
                  WaitUntil.the(LBL_SIN_STOCK, isVisible()).forNoMoreThan(30).seconds(),
                  Enter.keyValues("").into(TXT_CANTIDAD_PRODUCTO),
                  Enter.keyValues("").into(TXT_CANTIDAD_PRODUCTO).thenHit(Keys.SHIFT).thenHit(Keys.END, Keys.BACK_SPACE),
                  Enter.theValue(cantidad).into(TXT_CANTIDAD_PRODUCTO),
                  WaitUntil.the(BTN_AGREGAR_CARRITO, isClickable()).forNoMoreThan(30).seconds(),
                  Click.on(BTN_AGREGAR_CARRITO),
                  WaitUntil.the(BTN_REVISAR_CARRO, isClickable()).forNoMoreThan(30).seconds(),
                  Click.on(BTN_REVISAR_CARRO)
          );



    }
    public static SeleccionarProductoStockTask onThePage(String cantidad, String producto ) {
        return Instrumented.instanceOf(SeleccionarProductoStockTask.class).withProperties(cantidad, producto);}
}
