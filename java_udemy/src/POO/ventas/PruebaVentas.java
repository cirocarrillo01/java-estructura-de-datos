package POO.ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("--- sistema de ventas ---");
        var producto1=new Producto("Blusa",30.00);
        var producto2=new Producto("zapatos",50.00);
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        System.out.println(orden1);
        //orden1.mostrarOrden();
        //segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("playersa",15.00));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        System.out.println(orden2);
        //orden2.mostrarOrden();
    }
}
