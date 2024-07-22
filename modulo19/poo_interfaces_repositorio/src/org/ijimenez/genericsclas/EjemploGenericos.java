package org.ijimenez.genericsclas;

import java.sql.SQLOutput;

public class EjemploGenericos {
    public static void main(String[] args) {

        System.out.println("-----Ejemplo de tranporte de caballos-----");
        Camion<Animal> tranporteCaballos = new Camion<>(5);
        tranporteCaballos.addObjetos(new Animal("peregrino", "Caballo"));
        tranporteCaballos.addObjetos(new Animal("grillo", "Caballo"));
        tranporteCaballos.addObjetos(new Animal("Tunquen", "Caballo"));

        for (Animal o : tranporteCaballos) {
            System.out.println("Nombre: " + o.getNombre() + " Tipo: " + o.getTipo());
        }

        System.out.println("-----Ejemplo de maquinaria -------");

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.addObjetos(new Maquinaria("Bulldizer"));
        transMaquinas.addObjetos(new Maquinaria("Grua Horquilla"));
        transMaquinas.addObjetos(new Maquinaria("Perforadora"));

        for (Maquinaria o : transMaquinas) {
            System.out.println("Tipo de maquinaria es: " + o.getTipo());
        }

        System.out.println("-----Ejemplo de Autos-----");

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.addObjetos(new Automovil("Toyota"));
        transAuto.addObjetos(new Automovil("Mitsubishi"));
        transAuto.addObjetos(new Automovil("Chevrolet"));

        for (Automovil o : transAuto) {
            System.out.println("La marca de Carro es: " + o.getMarca());
        }


        System.out.println("----------Elemplo usando Camion generico-----------");
        imprimirCamion(tranporteCaballos);
        imprimirCamion(transMaquinas);
        imprimirCamion(transAuto);
    }

    //Metodo generico y utilizando una clase generica Camion<T>
    // para poder imprimir Cualquier camion
    public static <T> void imprimirCamion(Camion<T> camion) {
        for (T o : camion) {

            if (o instanceof Animal) {
                System.out.println("El animal su nombre es " + ((Animal) o).getNombre() + " y su tipo es: " + ((Animal) o).getTipo());
            } else if (o instanceof Maquinaria) {
                System.out.println("Tipo de maquinaria " + ((Maquinaria) o).getTipo());
            } else if (o instanceof Automovil) {
                System.out.println("La marca es: " + ((Automovil) o).getMarca());
            }
        }
    }
}
