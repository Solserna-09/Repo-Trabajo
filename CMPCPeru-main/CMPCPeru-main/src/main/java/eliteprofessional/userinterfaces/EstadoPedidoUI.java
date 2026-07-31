package eliteprofessional.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EstadoPedidoUI {


    public static final Target BTN_ORDENES= Target.the("Boton ubicar ordenes para elegir").locatedBy("(//a[@href='/compraonline/my-account/orders'])[2]");
    public static final Target TBL_ESTADOS= Target.the("Tabla de estados de pedidos").locatedBy("//div[@class='account-section-header']");
    public static final Target LBL_VALIDAR_NUMERO_PEDIDO= Target.the("label para validar el numero de pedido").locatedBy("(//td[@headers='headerSAP'])[1]");

    public static final Target LBL_VALIDAR_ESTADO_PEDIDO= Target.the("label para validar el estado del pedido").locatedBy("(//td[@headers='header3 status-error'])[1]");


    public static final Target BTN_CANCELAR_PEDIDO= Target.the("boton para cancelar el pedido").locatedBy("(//span[@class='glyphicon glyphicon-remove'])[1]");
    public static final Target BTN_CANCELAR_PEDIDO2= Target.the("boton para cancelar el pedido de segundo estado").locatedBy("(//span[@class='glyphicon glyphicon-remove'])[2]");

    public static final Target BTN_ACEPTO_CANCELAR= Target.the("Boton para aceptar la cancelacion del pedido").locatedBy("(//button[@class='js-cmpc_order_cancel_confirm btn btn-primary btn-block'])[1]");
    public static final Target BTN_ACEPTO_CANCELAR2= Target.the("Boton para aceptar la cancelacion del pedido de segundo estado").locatedBy("(//div[@id='cboxLoadedContent']//span[contains(text(), 'Nota de pedido:')]//following::button)[1]");






}
