package eliteprofessional.tasks;

import eliteprofessional.interactions.EsperaImplicita;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import static eliteprofessional.userinterfaces.BarraBusquedaUI.*;
import static eliteprofessional.userinterfaces.InicioSesionUI.*;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class BuscarProductoTask implements Task {
    String producto;
    String cantidad;
    String segundoProducto;
    String segundaCantidad;

    public BuscarProductoTask(String producto, String cantidad, String segundoProducto, String segundaCantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.segundoProducto = segundoProducto;
        this.segundaCantidad = segundaCantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


            actor.attemptsTo(
                    Enter.theValue(producto).into(TXT_BUSCAR).thenHit(Keys.ENTER),
                    WaitUntil.the(TXT_BARRA_BUSQUEDA.of(segundoProducto), isVisible()).forNoMoreThan(30).seconds(),
                    Enter.theValue(cantidad).into(TXT_BARRA_BUSQUEDA.of(segundoProducto)),
                   Click.on(BTN_AGREGAR_CARRITO.of(segundoProducto)),
                   EsperaImplicita.enSegundos(200),
                    Click.on(BTN_SEGUIR_COMPRANDO),
                    Enter.theValue(cantidad).into(TXT_BARRA_BUSQUEDA2),
                    Click.on(BTN_AGREGAR_CARRITO2),
                    EsperaImplicita.enSegundos(500),
                    Click.on(BTN_REVISAR_CARRITO),
                    EsperaImplicita.enSegundos(300)

            );

    }
    public static BuscarProductoTask onThePage( String cantidad, String producto ,String segundoProducto, String segundaCantidad) {
        return Instrumented.instanceOf(BuscarProductoTask.class).withProperties(cantidad, producto,segundoProducto, segundaCantidad);
    }
}