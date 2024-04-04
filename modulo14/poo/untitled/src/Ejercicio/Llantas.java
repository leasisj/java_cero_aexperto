package Ejercicio;

public enum Llantas {
    PIRELLI("PIRELLI", 15, 25 ),
    MICHELIN("MICHELIN", 15, 25 ),
    KUMHO("KUMHO", 15, 25 ),
    GOODYEAR("GOODYEAR", 15, 25 ),
    HANKOOK("HANKOOK", 15, 25 ),
    ;

    private final String fabricante;
    private final int rin;
    private final int ancho;

    Llantas(String fabricante, int rin, int ancho) {
        this.fabricante = fabricante;
        this.rin = rin;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getRin() {
        return rin;
    }

    public int getAncho() {
        return ancho;
    }


}
