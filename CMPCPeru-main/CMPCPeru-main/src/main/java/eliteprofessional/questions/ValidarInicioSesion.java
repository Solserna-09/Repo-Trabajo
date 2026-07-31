package eliteprofessional.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import javax.swing.*;

import static eliteprofessional.userinterfaces.PaginaInicioUI.LBL_INICIO_SESION;


public class ValidarInicioSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean a = LBL_INICIO_SESION.resolveFor(actor).isVisible();
        if(a == true){
            BrowseTheWeb.as(actor).getDriver().close();
            JOptionPane.showMessageDialog(null, "Verificar Credenciales", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

    }
    public static ValidarInicioSesion onThePage() {
        return Instrumented.instanceOf(ValidarInicioSesion.class).withProperties();

    }


}
