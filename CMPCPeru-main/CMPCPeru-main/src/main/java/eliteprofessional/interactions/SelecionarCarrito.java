package eliteprofessional.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;


import static eliteprofessional.userinterfaces.CatalogoUI.TXT_CATEGORIA_SELECCIONAR;

public class SelecionarCarrito implements Interaction {
    String producto;
    String cantidad;


    public SelecionarCarrito(String producto, String cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> list;
        list = TXT_CATEGORIA_SELECCIONAR.of(producto).resolveAllFor(actor);
        list.get(list.size() - 1).sendKeys(cantidad);
        EsperaExplicita.enSegundos(10);



    }

    public static SelecionarCarrito on(String cantidad, String producto) {
        return Instrumented.instanceOf(SelecionarCarrito.class).withProperties(cantidad, producto);
    }
}

