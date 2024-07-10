package org.ijimenez.poosobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Sumar int "+calculadora.sumar(10,4));

        System.out.println("Sumar float "+calculadora.sumar(10.0f,5f));

        System.out.println("Sumar float-int: "+calculadora.sumar(10f, 5f)+ calculadora.sumar(5,2));

        System.out.println("Sumar float "+calculadora.sumar("2", "4h"));
    }
}
