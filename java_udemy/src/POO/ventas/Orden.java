package POO.ventas;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    //agregar producto metodo
    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS)
            this.productos[this.contadorProductos++] = producto;
        else
            System.out.println("se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
    }

    public double calcularTotal() {
        double total = 0;
        for (var i = 0; i < this.contadorProductos; i++) {
            var producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        var resultado = "id. Orden: " + this.idOrden + "\n";
        var totalOrden = this.calcularTotal();
        resultado += "\tTotal de la Orden: $" + totalOrden + "\n";
        resultado += "\tProductos de la Orden: " + "\n";
        for (var i = 0; i < this.contadorProductos; i++)
                resultado += "\t\t" + this.productos[i] + "\n";
        return resultado;

    }
}