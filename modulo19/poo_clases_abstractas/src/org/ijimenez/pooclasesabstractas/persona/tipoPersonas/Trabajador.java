package org.ijimenez.pooclasesabstractas.persona.tipoPersonas;

public class Trabajador extends Persona{

    private String empresa;
    private int horaEntrada;
    private int horaSalida;
    private int horaComida;

    public Trabajador(String id, int codigoPostal, String nombrePersona, String empresa, int horaEntrada, int horaSalida, int horaComida) {
        super(id, codigoPostal, nombrePersona);
        this.empresa = empresa;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.horaComida = horaComida;
    }

    @Override
    public String digujarConsola() {
        StringBuilder sb = new StringBuilder("Trabajador").
                append("\nID").append(this.id).
                append("\nNombrePersona: ").append(this.nombrePersona).
                append("\nCodigoPostal:").append(this.codigoPostal).
                append("\nEmpresa: ").append(this.empresa).
                append("\nHora de entrada: ").append(horaEntrada).
                append("\nHora de salida:").append(this.horaSalida).
                append("\nHora de comida: ").append(this.horaSalida);
        return sb.toString();
    }
}
