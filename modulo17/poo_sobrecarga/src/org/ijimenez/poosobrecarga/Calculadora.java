package org.ijimenez.poosobrecarga;

public class Calculadora {

    public int sumar(int a, int b){
        return  a+b;
    }

    public int sumar(String s, int... argumentos){
        int total =0;

        for (int i: argumentos){
            total+=i;
        }
        return  total;
    }

    public float sumar(float a, float b){
        return a+b;
    }

    public float sumar(int a, float b){
        return  a+b;
    }

    public float sumar(float a, int b){
        return  a+b;
    }

    public double sumar(double a, double b){
        return a+b;
    }

    public int sumar(String a, String b){
        int resultado;
        try {
            resultado = Integer.parseInt(a)+Integer.parseInt(b);
        }catch (NumberFormatException e){
            resultado = 0;

        }
        return  resultado;
    }



}
