package Ejercicio;

public class Rueda {

    private String fabricante;
    private int rin;
    private double ancho;

    public Rueda() {
    }

    public Rueda(String fabricante, int rin, double ancho) {
        this.fabricante = fabricante;
        this.rin = rin;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getRin() {
        return rin;
    }

    public void setRin(int rin) {
        this.rin = rin;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
