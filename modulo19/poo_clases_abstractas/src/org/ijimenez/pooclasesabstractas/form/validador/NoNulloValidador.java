package org.ijimenez.pooclasesabstractas.form.validador;

public class NoNulloValidador extends  validador{

    protected  String mensaje = "el campo %s no puede ser nulo";
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
        return (valor != null);
    }
}
