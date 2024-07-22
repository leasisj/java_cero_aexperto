package org.ijimenez.ejemplo;

import org.ijimenez.pooherencia.Alumno;
import org.ijimenez.pooherencia.AlumnoInternacional;
import org.ijimenez.pooherencia.Persona;
import org.ijimenez.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        System.out.println("========= Creacion de la instancia de la clase Alumno ========");
        Alumno alumno = new Alumno("Isael", "Jimenez", 30, "UAM");
        alumno.setNotaLengua(8.5);
        alumno.setNotaHistoria(6.2);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("isa@gmail.com");

        System.out.println("========= Creacion de la instancia de la clase Alumno Internacional ========");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Franck", "Jimenez", "Canada");
        alumnoInternacional.setEdad(18);
        alumnoInternacional.setInstitucion("Instituto Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaLengua(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematica(6.5);

        System.out.println("========= Creacion de la instancia de la clase Profesor ========");
        Profesor profesor = new Profesor("Susana", "Jimenez", "Matematicas");
        profesor.setEdad(29);

        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {
        System.out.println(persona);
    }
}
