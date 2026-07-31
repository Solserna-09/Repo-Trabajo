package eliteprofessional.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class CatalogoUI {


    public static final Target TXT_SELECCIONAR_CATEGORIA = Target.the("Barra de texto cantidad de papel higienico").locatedBy("//div[@class='col-xs-2 col-sm-2 col-md-2 categoryItems']//div[contains(text(),'{0}')]");
    public static final Target TXT_CATEGORIA_SELECCIONAR = Target.the("Barra de texto cantidad de papel higienico").locatedBy("//div[@data-product-code='{0}']//preceding::input[@id='pdpAddtoCartInput']");
    public static final Target BTN_AGREGAR_CARRO= Target.the("Boton agregar al carrito").locatedBy("(//button[@class='addToCartButton btn btn-primary btn-sm js-catalog-products-add-to-cart '])[1]");

    public static final Target BTN_TERCERA_PAGINA= Target.the("Boton para ir a la tercera pagina")
            .locatedBy("(//ul[@class='pagination']//a)[2]");

}
