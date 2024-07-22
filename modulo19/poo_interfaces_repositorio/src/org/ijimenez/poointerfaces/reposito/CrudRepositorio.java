package org.ijimenez.poointerfaces.reposito;


import org.ijimenez.poointerfaces.Model.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente obtenerPorId(Integer id);
    void crearCliente(Cliente cliente);
    void editarCliente(Cliente cliente);
    void eliminar(Integer id);

}
