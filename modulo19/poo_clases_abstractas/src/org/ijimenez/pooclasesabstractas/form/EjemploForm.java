package org.ijimenez.pooclasesabstractas.form;

import org.ijimenez.pooclasesabstractas.form.elementos.*;
import org.ijimenez.pooclasesabstractas.form.elementos.select.Opcion;
import org.ijimenez.pooclasesabstractas.form.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());
        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 10));
        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());
        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());
        TextareaForm experiencia = new TextareaForm("exp", 5, 9);
        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNulloValidador());
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java).
                addOpcion(new Opcion("2", "Python")).
                addOpcion(new Opcion("3", "JavaScript")).
                addOpcion(new Opcion("4", "TypeScript").setSelected()).
                addOpcion(new Opcion("5", "PHP"));

        ElementosForm saludo = new ElementosForm("Saludar") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name '" + this.nombre + "' value = \"" + this.valor + "\">";
            }
        };

        saludo.setValor("Hola que tal, este campo esta deshabilitado!");

        username.setValor("");
        password.setValor("abcde");
        email.setValor("john@correo.com");
        edad.setValor("29l");
        experiencia.setValor("... mas de 10 años de experiencia...");
        //java.setSelected(true);

        List<ElementosForm> elementos = Arrays.asList(
                username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludo
        );
        /*elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);*/

        /*for (ElementosForm e : elementos){
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }*/

        //------aqui se esta dibujando todo
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        //---------- aqui se esta haciendo la validacion
        elementos.forEach(e -> {
            if (!e.esValido()){
                //System.out.println(e.getNombre()+": "+err);*/
                e.getErrores().forEach(System.out::println);
            }
        });

    }
}
