package eliteprofessional.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioUI {

    public static final Target BTN_MIS_PRODUCTOS= Target.the("Click en mis Productos").located(By.xpath("//a[.='Mis productos']"));
    public static final Target BTN_CATALOGO= Target.the("Click boton catalogo").locatedBy("//a[text()='Catálogo']");
    public static final Target LBL_INICIO_SESION = Target.the("Boton Ingresar a mis productos").locatedBy("//div[@class='alert alert-danger alert-dismissable']");

}
