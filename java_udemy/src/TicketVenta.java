import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("--- generacion ticket de venta ---");
        var consola = new Scanner(System.in);
        System.out.print("precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());
        System.out.print("precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());
        System.out.print("precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());
        System.out.print("precio platano: ");
        var precioPlatano = Double.parseDouble(consola.nextLine());
        System.out.println("Aplicar algun descuento (%)? ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());
        // calculo del subtotal (sin impuesto)
        var subTotal = precioLeche + precioLechuga + precioPan + precioPlatano;
        // aplicar el descuento
        var descuento = subTotal * (descuentoPorcentaje/100.0);
        // subtotal con descuento
        var subtotalConDescuento = subTotal - descuento;
        // calculo de impuestos
        var impuestos = subTotal * 0.16;
        // calculo total de la compra (con impuestos)
        var costoTotalCompra = subtotalConDescuento + impuestos;
        // imprimir el ticket de venta
        System.out.printf("""
                %n Ticket de venta
                ------------------
                subtotal: $%.2f
                descuento: $%.2f (%d%%)
                impuesto (16%%): $%.2f
                costo total de la compra: $%.2f
                """, subTotal,descuento,descuentoPorcentaje ,impuestos, costoTotalCompra);

    }
}
