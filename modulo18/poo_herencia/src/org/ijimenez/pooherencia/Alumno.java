package org.ijimenez.pooherencia;

public class Alumno extends Persona {
    private String institucion;
    private double notaMatematica;
    private double notaLengua;
    private double notaHistoria;

    public Alumno() {
        System.out.println("Alumno: Inicializando contructor");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion, double notaMatematica, double notaLengua, double notaHistoria) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
        this.notaMatematica = notaMatematica;
        this.notaLengua = notaLengua;
        this.notaHistoria = notaHistoria;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLengua() {
        return notaLengua;
    }

    public void setNotaLengua(double notaLengua) {
        this.notaLengua = notaLengua;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar(){

        return super.saludar()+ ", soy Alumno y mi nombre es "+getNombre();
    }

    public double calcularPromedio(){
        return (notaHistoria+notaLengua+notaMatematica)/3;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\ninstitucion='" + institucion + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaLengua=" + notaLengua +
                ", notaHistoria=" + notaHistoria+
                ", promedio= "+   this.calcularPromedio();
    }
}
