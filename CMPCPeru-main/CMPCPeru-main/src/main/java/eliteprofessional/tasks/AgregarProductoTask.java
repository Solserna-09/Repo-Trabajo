package eliteprofessional.tasks;



import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;


import static eliteprofessional.userinterfaces.PedidosUI.*;


public class AgregarProductoTask implements Task {

    String producto;
    String cantidad;
    String segundoProducto;
    String segundaCantidad;

    public AgregarProductoTask(String producto, String cantidad, String segundoProducto, String segundaCantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.segundoProducto = segundoProducto;
        this.segundaCantidad = segundaCantidad;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Enter.theValue(cantidad).into(TXT_PRODUCTO.of(producto)),
                Enter.theValue(segundaCantidad).into(TXT_PRODUCTO.of(segundoProducto)),
                JavaScriptClick.on(BTN_AGREGAR_CARRITO),
                Click.on(BTN_REVISAR_CARRO)


        );

    }

    public static AgregarProductoTask onThePage( String cantidad, String producto ,String segundoProducto, String segundaCantidad) {
        return Instrumented.instanceOf(AgregarProductoTask.class).withProperties(cantidad, producto,segundoProducto, segundaCantidad);
    }

}