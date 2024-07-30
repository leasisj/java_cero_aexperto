package org.ijimenez.poointerfaces.reposito;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();
    T obtenerPorId(Integer id);
    void crearCliente(T t);
    void editarCliente(T t);
    void eliminar(Integer id);
}
