package eliteprofessional.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static eliteprofessional.userinterfaces.PagarUI.BTN_FECHA_HABILITADA;

public class SeleccionarFecha implements Interaction {
        @Override
        public <T extends Actor> void performAs(T actor) {
            Random random = new Random();
            List<WebElementFacade> list;
            list = BTN_FECHA_HABILITADA.resolveAllFor(actor);
            int randomNumber = random.nextInt(list.size());
                list.get(randomNumber).click();

        }
        public static Performable on(){
            return Instrumented.instanceOf(SeleccionarFecha.class).withProperties();
        }
    }

