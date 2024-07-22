package org.ijimenez.pooclasesabstractas.form.validador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidador extends validador{

    private String mensaje = "el formato del %s es invalido";
    // Expresión regular para validar correos electrónicos
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    // Patrón compilado
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

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

        if (valor == null){
            return false;
        }
        Matcher matcher = EMAIL_PATTERN.matcher(valor);

        return matcher.matches();
    }
}
