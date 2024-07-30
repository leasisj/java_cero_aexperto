package org.ijimenez.poointerfaces.reposito.lista;

import org.ijimenez.poointerfaces.Model.Cliente;
import org.ijimenez.poointerfaces.Model.Producto;
import org.ijimenez.poointerfaces.reposito.AbstractaListRepositorio;
import org.ijimenez.poointerfaces.reposito.Direccion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {

    @Override
    public void editarCliente(Producto producto) {
        Producto p = obtenerPorId(producto.getId());
        p.setDescripcion(producto.getDescripcion());
        p.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion direccion) {

        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort(new Comparator<Producto>() {
            @Override
            public int compare(Producto a, Producto b) {
                {
                    int resultado = 0;
                    if (direccion == Direccion.ACENDENTE) {
                        resultado = ordenar(campo,a, b);
                    } else if (direccion == Direccion.DESENDENTE) {
                        resultado = ordenar(campo, b, a);
                    }
                    return resultado;
                }
            }
        });
        return listaOrdenada;
    }

    private int ordenar(String campo, Producto a, Producto b) {
        int resultado = 0;

        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "descripcion" -> resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" -> resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }


}

