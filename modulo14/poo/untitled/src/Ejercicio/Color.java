package Ejercicio;

public enum Color {

    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    BLANCO("Blanco"),
    GRIS("Gris"),
    NARANJA("Naranja");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  color;
    }
}
