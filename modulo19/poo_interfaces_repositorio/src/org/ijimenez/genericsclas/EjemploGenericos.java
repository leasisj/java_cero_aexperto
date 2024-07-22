package org.ijimenez.genericsclas;

import java.sql.SQLOutput;

public class EjemploGenericos {
    public static void main(String[] args) {

        System.out.println("-----Ejemplo de tranporte de caballos-----");
        Camion tranporteCaballos  = new Camion(5);
        tranporteCaballos.addObjetos(new Animal("peregrino", "Caballo"));
        tranporteCaballos.addObjetos(new Animal("grillo","Caballo"));
        tranporteCaballos.addObjetos(new Animal("Tunquen", "Caballo"));

        for (Object o: tranporteCaballos){
            Animal a = (Animal) o;
            System.out.println("Nombre: "+a.getNombre()+" Tipo: "+a.getTipo());
        }

        System.out.println("-----Ejemplo de maquinaria -------");

        Camion transMaquinas = new Camion(3);
        transMaquinas.addObjetos(new Maquinaria("Bulldizer"));
        transMaquinas.addObjetos(new Maquinaria("Grua Horquilla"));
        transMaquinas.addObjetos(new Maquinaria("Perforadora"));

        for (Object o : transMaquinas){
            Maquinaria m= (Maquinaria) o;
            System.out.println("Tipo de maquinaria es: "+m.getTipo());
        }

        System.out.println("-----Ejemplo de Autos-----");

        Camion transAuto = new Camion(3);
        transAuto.addObjetos(new Automovil("Toyota"));
        transAuto.addObjetos(new Automovil("Mitsubishi"));
        transAuto.addObjetos(new Automovil("Chevrolet"));

        for (Object o : transAuto){
            Automovil a = (Automovil) o;
            System.out.println("La marca de Carro es: "+a.getMarca());
        }
    }
}
