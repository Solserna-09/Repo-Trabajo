package eliteprofessional.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DestinatarioUI {

    public static final Target TXT_BUSCAR_DESTINA= Target.the("Barra de texto para buscar destinatario").located(By.id("addresseeName"));
    public static final Target BTN_CAMBIAR_DESTINATARIO = Target.the("Boton cambiar tipo de destinatario").locatedBy("//button[@id='submit-change-addressee']");
    public static final Target BTN_SELECCIONAR = Target.the("Boton Seleccionar destinatario").locatedBy("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li");



}
