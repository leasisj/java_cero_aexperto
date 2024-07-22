package org.ijimenez.pooclasesabstractas.persona.tipoPersonas;

public class Alumno extends Persona {

    private int matricula;
    private int calificacion;
    private String pais;


    public Alumno(String id,
                  int codigoPostal,
                  String nombrePersona,
                  int matricula,
                  int calificacion,
                  String pais) {
        super(id, codigoPostal, nombrePersona);
        this.matricula = matricula;
        this.calificacion = calificacion;
        this.pais = pais;
    }


    @Override
    public String digujarConsola() {
        StringBuilder sb = new StringBuilder("Alumno");
        sb.append("\nNombre :").append(this.nombrePersona).
                append("\nId: ").append(this.id).
                append("\nCodigoPostal: ").append(this.codigoPostal).
                append("\nMatricula: ").append(matricula).
                append("\nCalificacion: ").append(calificacion).
                append("\nPais: ").append(pais);

        return sb.toString();
    }
}
