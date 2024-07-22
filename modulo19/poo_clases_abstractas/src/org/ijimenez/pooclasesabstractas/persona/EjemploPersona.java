package org.ijimenez.pooclasesabstractas.persona;

import org.ijimenez.pooclasesabstractas.persona.Validador.CadenaValida;
import org.ijimenez.pooclasesabstractas.persona.Validador.NumeroValido;
import org.ijimenez.pooclasesabstractas.persona.tipoPersonas.Alumno;
import org.ijimenez.pooclasesabstractas.persona.tipoPersonas.Persona;
import org.ijimenez.pooclasesabstractas.persona.tipoPersonas.Trabajador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploPersona {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("1", 14400, "AA", 123, 8, "Mexico");
        alumno1.addValidador(new CadenaValida());
      /*  Alumno alumno2 = new Alumno("2", 14400, "Pepe", 123, 8, "Mexico");
        alumno2.addValidador(new NumeroValido());
        Alumno alumno3 = new Alumno("3", 14400, "Pepe", 123, 8, "Mexico");
        alumno3.addValidador(new NumeroValido());*/


        Trabajador trabajador1 = new Trabajador("1", 1414,"Luis", "Akbal", 7,5,2);
    /*    trabajador1.addValidador(new CadenaValida());*/

        List<Persona> personas = Arrays.asList(alumno1,trabajador1);
        personas.forEach(e->{
            System.out.println(e.digujarConsola());
            System.out.println("--------------------");
        });

        /*personas.forEach(e-> {
            if (!e.esValidoId()){
                e.getErrores().forEach(System.out::println);
            }
        });*/
        personas.forEach(e->{
            if (!e.esValidoNombrePersona()){
                e.getErrores().forEach(System.out::println);
            }
        });

    }
}
