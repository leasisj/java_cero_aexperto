package org.ijimenez.poointerfaces.reposito;

import org.ijimenez.poointerfaces.Model.BaseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T> {

    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T obtenerPorId(Integer id) {
        T resultado = null;

        for (T cli : dataSource) {
            if (cli.getId() != null && Objects.equals(cli.getId(), id)) {
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crearCliente(T t) {

        this.dataSource.add(t);

    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.obtenerPorId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }
}
