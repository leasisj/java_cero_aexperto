package ProyectoOrdenCompra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenCompra {
    private int identificador; //TODO HACERLO AUTO INCREMENTABLE
    private static int ultimoId;
    private String descripcion;

    private Date fecha;

    private Cliente cliente;
    private  List<Productos> productos;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = ++ultimoId;
        this.fecha = new Date();
        productos = new ArrayList<>();
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }
    public List<Productos> getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addProducto(Productos producto){
        productos.add(producto);
    }

    public double granTotal(){
        double total = 0;
        for (int i = 0;i<productos.size(); i++){
            total+= productos.get(i).getPrecio();
        }
        return  total;
    }

    public String verDetalle(){
        String detalle = "Compra id: "+ this.identificador+"\n" + "Fecha: "+ this.fecha+"\n";

        for (int i = 0; i<productos.size(); i++) {
            detalle +=
                        "Fabricante: " + this.productos.get(i).getFabricante()+"|"+
                        " Nombre: " +this.productos.get(i).getNombre()+"|"+
                        " Precio: " +this.productos.get(i).getPrecio()+"\n"
            ;
        }
        detalle+="Total: "+this.granTotal()+"\n"+ "--------------------------------------";

        return detalle;
    }

}
