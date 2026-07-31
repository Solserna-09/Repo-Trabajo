package eliteprofessional.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosSinStockUI {

    public static final Target BTN_PRODUCTO_SIMILAR= Target.the("Boton Productos similares").locatedBy("(//button[@data-title='No hay productos sustitutos disponibles'])[1]");

    public static final Target BTN_SALIR= Target.the("Boton Salir de mis productos").locatedBy("//button[@id='cboxClose']");

    public static final Target IMG_SIN_STOCK = Target.the("Imagen Producto Sin Stock").locatedBy("//div[@data-product-code='{0}']/preceding-sibling::div[@class='thumb']");

    public static final Target LBL_SIN_STOCK = Target.the("Label de validacion, sin Stock").locatedBy("//span[@class='unavailableProductAlert']");

    public static final Target TXT_CANTIDAD_PRODUCTO = Target.the("Barra de texto cantidad producto").locatedBy("//input[@name='pdpAddtoCartInput']");

    public static final Target BTN_AGREGAR_CARRITO = Target.the("Boton Agregar al carrito").locatedBy("//button[@id='addToCartButton']");

    public static final Target BTN_REVISAR_CARRO = Target.the("Boton Revisar Carrito").locatedBy("//a[@class='btn btn-primary btn-block add-to-cart-button']");

    public static final Target TXT_CANTIDAD_SEGUNDO_PRODUCTO = Target.the("Barra de texto segundo producto").locatedBy("//input[@data-product-selection='{\"product\":\"{0}\"}']");

    public static final Target BTN_AGREGA_CARRITO = Target.the("Boton Agregar al carrito").locatedBy("//button[@data-product='{0}']/span[@class='glyphicon glyphicon-shopping-cart']");

    public static final Target BTN_REVISAR_CARRITO_2 = Target.the("Boton Agregar al carrito").locatedBy("//a[@class='btn btn-primary btn-block add-to-cart-button']");


    public static final Target BTN_REGRESAR_CARRITO = Target.the("Boton regresar del carrito").locatedBy("//div[@class='mini-cart-count js-mini-cart-count']");

    public static final Target BTN_REVISAR_CARRITO = Target.the("Boton Revisar carrito").locatedBy("//a[@class='btn btn-primary btn-block mini-cart-checkout-button']");

    public static final Target BTN_LIMPIAR_CARRO = Target.the("Boton Limpiar carrito").locatedBy("//button[@class='btn btn-default btn-clear-cart']");


}
