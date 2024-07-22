package org.ijimenez.poointerfaces.reposito;

import org.ijimenez.poointerfaces.Model.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion direccion);

}
