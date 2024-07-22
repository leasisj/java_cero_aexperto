package org.ijimenez.genericos;

import org.ijimenez.poointerfaces.Model.Cliente;
import org.ijimenez.poointerfaces.Model.ClientePremium;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        System.out.println("Ejemlo de metodos generocos");

        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Isael", "Jimenez"));
        /*Cliente isael = (Cliente) clientes.get(0);
        Cliente isa = (Cliente) clientes.iterator();*/
        Cliente isael = clientes.get(0);
        System.out.println(isael);

        Cliente[] clientesAreglo = {
                new Cliente("Susan", "Mundo"),
                new Cliente("Pepe", "Sandoval")};

        Integer[] enteros = {1, 2, 3};

        List<Cliente> clientesLista = fromArrayToList(clientesAreglo);
        List<Integer> enterosLista = fromArrayToList(enteros);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        System.out.println("-----------Ejemplo con dos parametros---------------");

        List<String> nombres = fromArrayToList(new String[]{"Andres", "Pepe", "Luci", "Bea", "John"}, enteros);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientePremiums = fromArrayToList(
                new ClientePremium[]{
                        new ClientePremium("Paco", "Hernandes")
                });
        clientePremiums.forEach(System.out::println);

        System.out.println("----------------------");
        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientePremiums);

        System.out.println("---------Maximo entre tres objetos -----------");

        Integer maximo = maximo(1,2,3);
        System.out.println("El macimo de 1,2,3: es "+maximo);
        String maximoFruta = maximo("zanaoria","arandanos", ",mazamas");
        System.out.println("El maximo entre zanaoria, arandano y manzana es: "+maximoFruta);
    }

    //Conversion de un arreglo a una lista de Clientes ocupando genericos
    //parametros genericos
    public static <T> List<T> fromArrayToList(T[] c) {

        return Arrays.asList(c);
    }

    //ejemplo genericos con limitaciones
    public static <T extends Number> List<T> fromArrayToList(T[] c) {

        return Arrays.asList(c);
    }

    //este se ocupa para poder limitar la implementacion de la clase Generica
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c) {

        return Arrays.asList(c);
    }

    //C es para convertir y G es para iterar
    public static <T, G> List<T> fromArrayToList(T[] c, G[] g) {

        for (G elemento : g) {
            System.out.println(elemento);
        }

        return Arrays.asList(c);
    }

    //comodines, se puede imprimir todas las listas de tipo cliente, pero no sus hijas
    //una clase de listaCliente no es lo mismo a una listaClientesPremium
    public static void imprimirClientes(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }

    //calcular el mayor de tres objetos

    public static <T extends Comparable<T>>T maximo (T a, T b, T c){

        T max = a;
        if (b.compareTo(max)>0){
            max = b;
         }
        if (c.compareTo(max)>0){
            max = c;
        }
        return max;
    }


}
