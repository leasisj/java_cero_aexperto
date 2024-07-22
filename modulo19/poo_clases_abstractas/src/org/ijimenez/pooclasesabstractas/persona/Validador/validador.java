package org.ijimenez.pooclasesabstractas.persona.Validador;

abstract public class validador {
    protected String mensaje;
    abstract public void setMensaje(String mensaje);
    abstract public String getMensaje();
    abstract public boolean esValido(String valor);
}
