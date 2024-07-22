package org.ijimenez.ejemplo;

import org.ijimenez.pooherencia.Alumno;
import org.ijimenez.pooherencia.AlumnoInternacional;
import org.ijimenez.pooherencia.Persona;
import org.ijimenez.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("========= Creacion de la instancia de la clase Alumno ========");
        Persona alumno = new Alumno();
        alumno.setNombre("Isael");
        alumno.setApellido("Jimenez");
        ((Alumno) alumno).setInstitucion("UAM");
        ((Alumno) alumno).setNotaLengua(8.5);
        ((Alumno) alumno).setNotaHistoria(6.2);
        ((Alumno) alumno).setNotaMatematica(4.9);

        System.out.println("========= Creacion de la instancia de la clase Alumno Internacional ========");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Franck");
        alumnoInternacional.setApellido("Jimenez");
        alumnoInternacional.setPais("Canada");
        alumnoInternacional.setEdad(18);
        alumnoInternacional.setInstitucion("Instituto Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaLengua(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematica(6.5);

        System.out.println("========= Creacion de la instancia de la clase Profesor ========");
        Profesor profesor = new Profesor();
        profesor.setNombre("Susana");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicasa");

        System.out.println(
                alumno.getNombre()
                        + " " + alumno.getApellido()
                        + " " + ((Alumno) alumno).getInstitucion());

        System.out.println(
                "Profesor " +
                        profesor.getAsignatura()
                        + ": " + profesor.getNombre()
                        + " " + profesor.getApellido());

        System.out.println(
                alumnoInternacional.getNombre()
                        + " " + alumnoInternacional.getApellido()
                        + " " + alumnoInternacional.getPais() +
                        " " + alumnoInternacional.getInstitucion());

        Class clase = alumnoInternacional.getClass();

        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
