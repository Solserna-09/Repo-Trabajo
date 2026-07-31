package eliteprofessional.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PagarUI {


    public static final Target BTN_FINALIZAR_PEDIDO = Target.the("Boton para terminar con mi pedido").locatedBy("//button[@class='btn btn-primary checkoutButton continueCheckout']");
    public static final Target BTN_CALENDARIO = Target.the("Boton seleccionar fecha calendario").locatedBy("//i[@class='glyphicon glyphicon-calendar js-open-datepicker']");

    public static final Target BTN_SIGUIENTE_CALENDARIO = Target.the("Boton siguiente mes").locatedBy("//a[@data-handler='next']");
    public static final Target BTN_FECHA_HABILITADA = Target.the("Boton Seleccionar Fecha disponible").locatedBy("//a[@class='ui-state-default']");

    public static final Target TXT_NUMERO_ORDEN = Target.the("Barra de texto numero de orden").locatedBy("//input[@id='customerOrderCode']");
    public static final Target TXT_OBSERVACION_ORDEN = Target.the("Barra de texto observacion").locatedBy("//textarea[@id='officeObservationsCTE']");

    public static final Target RDA_ACEPTO_TERMINOS = Target.the("Radio Buton acepto terminos y condiciones").locatedBy("//input[@id='Terms1']");

    public static final Target BTN_REALIZAR_PEDIDOS = Target.the("Boton Realizar Pedidos").locatedBy("//button[@id='placeOrder']");

    public static final Target LBL_VALIDAR_IVA = Target.the("Label validar iva").locatedBy("//div[@class='tax row']");

    public static final Target BTN_ACEPTAR_ALERTA = Target.the("Boton para terminar con mi pedido").locatedBy("//button[@id='productNoStockAcceptButton']");


}
