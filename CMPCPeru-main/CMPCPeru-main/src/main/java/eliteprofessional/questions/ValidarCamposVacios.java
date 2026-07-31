package eliteprofessional.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import javax.swing.*;


public class ValidarCamposVacios implements Task {
    String producto;
    String cantidad;
    String segundoProducto;
    String segundaCantidad;

    public ValidarCamposVacios(String producto, String cantidad, String segundoProducto, String segundaCantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.segundoProducto = segundoProducto;
        this.segundaCantidad = segundaCantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (producto.isEmpty()||cantidad.isEmpty()||segundoProducto.isEmpty()||segundaCantidad.isEmpty()) {
            BrowseTheWeb.as(actor).getDriver().close();
            if (producto.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo Primer Producto Se encuentra vacio", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
            if (cantidad.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La primera cantidad se encuentra vacio", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
            if (segundoProducto.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo segundo producto Se encuentra vacio", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
            if (segundaCantidad.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La segunda cantidad se encuentra vacio", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

            System.exit(0);
        }
    }



    public static ValidarCamposVacios onThePage(String cantidad, String producto , String segundoProducto, String segundaCantidad) {
        return Instrumented.instanceOf(ValidarCamposVacios.class).withProperties(cantidad, producto,segundoProducto, segundaCantidad);
    }
}