package org.ijimenez.pooclasesabstractas.form.validador;

abstract public class validador {
    protected String mensaje;
    abstract public void setMensaje(String mensaje);
    abstract  public  String getMensaje();
    abstract public boolean esValidado(String valor);

}
