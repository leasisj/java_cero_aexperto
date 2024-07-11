package org.ijimenez.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Isael");
        alumno.setApellido("Jimenez");
        Profesor profesor = new Profesor();
        profesor.setNombre("Susana");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicasa");

        System.out.println(
                alumno.getNombre()
                +" "+alumno.getApellido());
        System.out.println(
                "Profesor "+
                profesor.getAsignatura()
                +": "+ profesor.getNombre()
                +" "+profesor.getApellido());
    }
}
