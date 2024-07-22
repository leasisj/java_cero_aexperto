package org.ijimenez.pooclasesabstractas.persona.Validador;

import java.sql.SQLOutput;

public class NumeroValido extends validador {

    private String mensaje = "El numero que ingresaste no es valido";

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
        if (valor == null) {
            return false;
        }
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
