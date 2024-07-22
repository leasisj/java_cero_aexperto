package org.ijimenez.pooclasesabstractas.form.validador;

public class RequeridoValidador extends validador{
    protected  String mensaje = "el campo %s es requerido";
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
        return (valor != null && !valor.isEmpty());
    }
}
