package org.ijimenez.poointerfaces.reposito;

import org.ijimenez.poointerfaces.Model.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ClienteListRepositorio implements OrdenablePaginableCrudRepositorio{

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente obtenerPorId(Integer id) {
        Cliente resultado = null;

        for (Cliente cli : dataSource) {
            if (cli.getId() != null && Objects.equals(cli.getId(), id)) {
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crearCliente(Cliente cliente) {

        this.dataSource.add(cliente);

    }

    @Override
    public void editarCliente(Cliente cliente) {

        Cliente c = this.obtenerPorId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());

    }

    @Override
    public void eliminar(Integer id) {
        Cliente c = this.obtenerPorId(id);
        this.dataSource.remove(c);
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
                       resultado = this.ordenar(a,b);
                    } else if (direccion == Direccion.DESENDENTE) {
                        resultado = this.ordenar(b,a);
                    }
                    return resultado;
                }
            }

            private int ordenar(Cliente a, Cliente b){
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
        /*dataSource.sort((a, b) -> {

            int resultado = 0;

            if (direccion == Direccion.ACENDENTE) {
                switch (campo) {
                    case "id" -> resultado = a.getId().compareTo(b.getId());
                    case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
                    case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
                }
            } else if (direccion == Direccion.DESENDENTE) {
                switch (campo) {
                    case "id" -> resultado = b.getId().compareTo(a.getId());
                    case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
                    case "apellido" -> resultado = b.getApellido().compareTo(a.getApellido());
                }
            }
            return resultado;
        });
        return dataSource;*/
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }
}
