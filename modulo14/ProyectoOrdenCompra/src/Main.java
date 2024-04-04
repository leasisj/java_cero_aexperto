import ProyectoOrdenCompra.OrdenCompra;
import ProyectoOrdenCompra.Productos;

public class Main {
    public static void main(String[] args) {

        OrdenCompra orden1 = new OrdenCompra("Es un dulce lleno de chocolate");
        OrdenCompra orden2 = new OrdenCompra("Es un dulce lleno de chocolate");
        OrdenCompra orden3 = new OrdenCompra("Es un dulce lleno de chocolate");

        Productos producto1 = new Productos("Marinela", "Gancito", 25);
        Productos producto2 = new Productos("Barcel", "Chetos", 20);
        Productos producto3 = new Productos("Mauchan", "Sopa", 18);
        Productos producto4 = new Productos("Marineta", "Galletas", 25);
        orden1.addProducto(producto1);
        orden1.addProducto(producto2);
        orden1.addProducto(producto3);
        orden1.addProducto(producto4);

        orden2.addProducto(producto1);
        orden2.addProducto(producto2);
        orden2.addProducto(producto3);
        orden2.addProducto(producto4);

        orden3.addProducto(producto1);
        orden3.addProducto(producto2);
        orden3.addProducto(producto3);
        orden3.addProducto(producto4);

        System.out.println(orden1.verDetalle());
        System.out.println(orden2.verDetalle());
        System.out.println(orden3.verDetalle());

    }
}