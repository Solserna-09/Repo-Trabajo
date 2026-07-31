package eliteprofessional.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PedidosUI {

    public static final Target TXT_PRODUCTO= Target.the("Barra de texto cantidad producto").locatedBy("//input[@data-product-selection='{\"product\":\"{0}\"}']");
    public static final Target BTN_AGREGAR_CARRITO= Target.the("Boton agregar carrito").locatedBy("(//button[@class='addToCartButton btn btn-primary btn-sm js-group-products-add-to-cart '])[1]");

    public static final Target BTN_REVISAR_CARRO= Target.the("Boton Revisar Carrito").locatedBy("//a[@class='btn btn-primary btn-block add-to-cart-button']");

    public static final Target IMG_PRODUCTO_SIN_STOCK= Target.the("Barra de texto cantidad producto").locatedBy("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/div[2]/div[27]/div[1]/div[1]/div[1]/a[1]/img[1] ");
    public static final Target TXT_CANTIDAD_SIN_STOCK= Target.the(" texto cantidad sin stock").located(By.name("pdpAddtoCartInput"));


}
