package org.ijimenez.pooclasesabstractas.form.validador;

import org.ijimenez.pooclasesabstractas.form.elementos.SelectForm;
import org.ijimenez.pooclasesabstractas.form.validador.mensaje.IMensajeFormateable;

public class LargoValidador extends validador implements IMensajeFormateable {

    protected String mensaje = "el campo %s debe tener minimo %d caracteres y maximo %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValidado(String valor) {

        /*this.mensaje = String.format(this.mensaje, this.min, this.max);*/

        if (valor == null) {
            return true;
        }
        int largo = valor.length();
        return largo >= min && largo <= max;
    }

    @Override
    public String getMensajeFormateado(String campo) {
        return String.format(this.mensaje, campo, this.min, this.max);
    }

    /*public String getMensajeFormateado(String campo){
    }*/

}
