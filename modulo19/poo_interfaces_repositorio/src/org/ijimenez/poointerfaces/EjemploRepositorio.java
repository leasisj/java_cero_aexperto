package org.ijimenez.poointerfaces;

import org.ijimenez.poointerfaces.Model.Cliente;
import org.ijimenez.poointerfaces.reposito.*;

import java.sql.SQLOutput;
import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        //agregando clientes a la lista
        CrudRepositorio repositorio = new ClienteListRepositorio();
        repositorio.crearCliente(new Cliente("Isa", "Jimenez"));
        repositorio.crearCliente(new Cliente("Ruby", "Gonzales"));
        repositorio.crearCliente(new Cliente("Ale", "Guzman"));

        //imprimiendo los clientes
        List<Cliente> clientes = repositorio.listar();
        clientes.forEach(System.out::println);
        System.out.println("-------Paginable--------");
        List<Cliente> paginable = ((PaginableRepositorio) repositorio).listar(1, 3);
        paginable.forEach(System.out::println);
        System.out.println("---------Orden acendente---------");

        List<Cliente> acendente = ((OrdenableRepositorio) repositorio).listar("id", Direccion.DESENDENTE);
        acendente.forEach(System.out::println);
        System.out.println("---------Desendente Nombre---------");
        List<Cliente> nombre = ((OrdenableRepositorio) repositorio).listar("nombre", Direccion.DESENDENTE);
        nombre.forEach(System.out::println);


        System.out.println("----------Editar-----------");
        Cliente clienteIsaActualizado = new Cliente("Isa", "Perez");
        clienteIsaActualizado.setId(1);
        repositorio.editarCliente(clienteIsaActualizado);
        Cliente isa = repositorio.obtenerPorId(1);
        System.out.println(isa);

        System.out.println("-----------Imprimir edicion-----------");

        List<Cliente> listaredicion = repositorio.listar();
        listaredicion.forEach(System.out::println);

        System.out.println("---------Eliminar---------");
        repositorio.eliminar(1);
        List<Cliente> clientesEliminado = repositorio.listar();
        clientesEliminado.forEach(System.out::println);
    }
}
