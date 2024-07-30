package org.ijimenez.poointerfaces;

import org.ijimenez.poointerfaces.Model.Cliente;
import org.ijimenez.poointerfaces.Model.Producto;
import org.ijimenez.poointerfaces.reposito.CrudRepositorio;
import org.ijimenez.poointerfaces.reposito.Direccion;
import org.ijimenez.poointerfaces.reposito.OrdenableRepositorio;
import org.ijimenez.poointerfaces.reposito.PaginableRepositorio;
import org.ijimenez.poointerfaces.reposito.lista.ClienteListRepositorio;
import org.ijimenez.poointerfaces.reposito.lista.ProductoListRepositorio;

import java.util.List;

public abstract class EjemploRepositorioProducto {
    public static void main(String[] args) {

        //agregando Productos a la lista
        CrudRepositorio<Producto> repositorio = new ProductoListRepositorio();
        repositorio.crearCliente(new Producto("Meza", 50.20));
        repositorio.crearCliente(new Producto("Silla", 18.5));
        repositorio.crearCliente(new Producto("Lampara", 15.5));

        //imprimiendo los clientes
        List<Producto> productos = repositorio.listar();
        productos.forEach(System.out::println);
        System.out.println("-------Paginable--------");
        List<Producto> paginable = ((PaginableRepositorio) repositorio).listar(1, 3);
        paginable.forEach(System.out::println);
        System.out.println("---------Orden acendente---------");

        List<Producto> acendente = ((OrdenableRepositorio) repositorio).listar("id", Direccion.DESENDENTE);
        acendente.forEach(System.out::println);
        System.out.println("---------Desendente Nombre---------");
        List<Producto> nombre = ((OrdenableRepositorio) repositorio).listar("nombre", Direccion.DESENDENTE);
        nombre.forEach(System.out::println);


        System.out.println("----------Editar-----------");
        Producto productoActualizado = new Producto("Meza de escritorio", 2500.00);
        productoActualizado.setId(1);
        repositorio.editarCliente(productoActualizado);
        Producto isa = repositorio.obtenerPorId(1);
        System.out.println(isa);

        System.out.println("-----------Imprimir edicion-----------");

        List<Producto> listaredicion = repositorio.listar();
        listaredicion.forEach(System.out::println);

        System.out.println("---------Eliminar---------");
        repositorio.eliminar(1);
        List<Producto> productoEliminado = repositorio.listar();
        productoEliminado.forEach(System.out::println);
    }
}
