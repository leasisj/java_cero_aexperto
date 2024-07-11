package org.ijimenez.appfacturas;

import org.ijimenez.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Producto producto;
        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Isael");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la desripcion de la factura");
        Factura factura = new Factura(s.nextLine(), cliente);

        System.out.println();
        for (int i = 0; i<2; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n° "+producto.getCodigo()+": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingresa la cantidad: ");

            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }

        System.out.println(factura.toString());

    }
}
