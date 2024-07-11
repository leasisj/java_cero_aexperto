package org.ijimenez.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;

    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    private Cliente cliente;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItemFactura() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    //Calcula el todal de la factura
    public float cacularTotal() {
        float total = 0.0f;
        /*for (ItemFactura item : this.items) {
            //validacion en
            if (item == null) {
                continue;
            }
            //se suma el total de cada linea en la variable total
            total += item.calcularImporte();
        }*/

        for( int i = 0; i<indiceItems; i++){
            total += this.items[i].calcularImporte();
        }
        return total;
    }
    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura N°: ");
        sb.append(folio)
                .append("\nCliente: ").append(this.cliente.getNombre())
                .append("\t Nif: ").append(this.cliente.getNif())
                .append("\nDescripcion: ").append(this.descripcion)
                .append("\n");
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM , yyyy");
        sb.append("Fecha Emision: ").append(df.format(this.fecha)).append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for (int i =0; i< indiceItems;i++) {
            sb.append( this.items[i].toString())
                    .append("\n");
        }
        sb.append("\nGran Total: ")
                .append(cacularTotal());
        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
