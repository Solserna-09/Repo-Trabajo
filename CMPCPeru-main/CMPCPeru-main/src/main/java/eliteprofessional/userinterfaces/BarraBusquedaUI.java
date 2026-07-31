package eliteprofessional.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BarraBusquedaUI {

    public static final Target TXT_BARRA_BUSQUEDA= Target.the("Barra de texto ingresar carrito").locatedBy("//input[@value='{0}']/../../../div/div/input");
    public static final Target TXT_BARRA_BUSQUEDA2= Target.the("Barra de texto ingresar carrito").locatedBy("(//input[@id='pdpAddtoCartInput'])[1]");
    public static final Target BTN_AGREGAR_CARRITO= Target.the("Boton agregar carrito").locatedBy("//button[@data-product='{0}']");
    public static final Target BTN_AGREGAR_CARRITO2= Target.the("Boton agregar carrito").locatedBy("(//button[@class='btn btn-primary glyphicon glyphicon-shopping-cart addToCartButton js-add-to-cart-catalog js-enable-btn'])[1]");
    public static final Target BTN_REVISAR_CARRITO = Target.the("CBoton revisar carrito").locatedBy("(//a[@class='btn btn-primary btn-block add-to-cart-button'])[1]");
    public static final Target BTN_SEGUIR_COMPRANDO = Target.the("CBoton revisar carrito").locatedBy("//a[contains(text(),'Seguir comprando')]");


}
