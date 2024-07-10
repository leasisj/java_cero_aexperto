package org.ijimenez.poosobrecarga;

public class Ejemplo {
    public static int contadorEstático = 0; // Variable estática
    public int contadorInstancia = 0;       // Variable de instancia

    public Ejemplo() {
        contadorEstático++;
        contadorInstancia++;
    }

    public static void main(String[] args) {
        Ejemplo obj1 = new Ejemplo();
        Ejemplo obj2 = new Ejemplo();

        System.out.println("Valor de contadorEstático: " + Ejemplo.contadorEstático); // Salida: 2
        System.out.println("Valor de contadorInstancia para obj1: " + obj1.contadorInstancia); // Salida: 1
        System.out.println("Valor de contadorInstancia para obj2: " + obj2.contadorInstancia); // Salida: 1
    }
}
