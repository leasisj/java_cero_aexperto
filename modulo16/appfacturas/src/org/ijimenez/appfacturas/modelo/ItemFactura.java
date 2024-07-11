package org.ijimenez.appfacturas.modelo;

import java.util.PrimitiveIterator;

public class ItemFactura {

    private int cantidad;
    private Producto producto;

    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    //calcular importe de la linea
    public float calcularImporte() {
        return this.cantidad * producto.getPrecio();
    }

    @Override
    public String toString() {
        return producto.toString() +
                "\t " + cantidad +
                "\t" + calcularImporte();
    }
}
