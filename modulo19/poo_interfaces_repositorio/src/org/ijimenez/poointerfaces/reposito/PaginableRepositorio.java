package org.ijimenez.poointerfaces.reposito;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar (int desde, int hasta);

}
