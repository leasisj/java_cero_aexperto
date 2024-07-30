package org.ijimenez.poointerfaces.reposito.lista;

import org.ijimenez.poointerfaces.Model.Cliente;
import org.ijimenez.poointerfaces.reposito.AbstractaListRepositorio;
import org.ijimenez.poointerfaces.reposito.Direccion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {
    @Override
    public void editarCliente(Cliente cliente) {

        Cliente c = this.obtenerPorId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());

    }

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {

        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b) {
                {
                    int resultado = 0;
                    if (direccion == Direccion.ACENDENTE) {
                        resultado = this.ordenar(a, b);
                    } else if (direccion == Direccion.DESENDENTE) {
                        resultado = this.ordenar(b, a);
                    }
                    return resultado;
                }
            }

            private int ordenar(Cliente a, Cliente b) {
                int resultado = 0;

                switch (campo) {
                    case "id" -> resultado = a.getId().compareTo(b.getId());
                    case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
                    case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
                }
                return resultado;
            }
        });
        return listaOrdenada;

    }
}