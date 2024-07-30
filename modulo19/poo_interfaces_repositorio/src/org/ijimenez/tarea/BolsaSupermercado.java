package org.ijimenez.tarea;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {

    private List<T> objetos;
    private int max;

    public BolsaSupermercado(List<T> objetos, int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }
}
