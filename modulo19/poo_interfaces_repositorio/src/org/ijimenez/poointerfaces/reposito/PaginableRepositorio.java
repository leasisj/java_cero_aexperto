package org.ijimenez.poointerfaces.reposito;

import org.ijimenez.poointerfaces.Model.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar (int desde, int hasta);

}
