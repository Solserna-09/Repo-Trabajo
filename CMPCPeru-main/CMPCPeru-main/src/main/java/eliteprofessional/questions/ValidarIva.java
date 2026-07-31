package eliteprofessional.questions;

import eliteprofessional.userinterfaces.PagarUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarIva implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return PagarUI.LBL_VALIDAR_IVA.resolveFor(actor).isVisible();
    }

    public static Question validarMensaje(){
        return new ValidarIva();
    }
}
