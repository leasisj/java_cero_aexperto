package org.ijimenez.pooclasesabstractas.persona.Validador;

public class CadenaValida extends validador{

    private String mensaje = "La cadena que ingresaste es incorrecto";
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor!= null && !valor.trim().isEmpty();
    }
}
