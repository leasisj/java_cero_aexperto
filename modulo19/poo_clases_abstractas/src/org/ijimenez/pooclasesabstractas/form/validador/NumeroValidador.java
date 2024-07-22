package org.ijimenez.pooclasesabstractas.form.validador;

public class NumeroValidador extends validador{

    protected String mensaje = "el campo %s no debe ser nulo";

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
        boolean isNumber = false;
        if (valor == null || valor.isEmpty()){
            return false;
        }

        try {
            Integer.parseInt(valor);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
