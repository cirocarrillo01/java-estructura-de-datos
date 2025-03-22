import java.util.Scanner;

public class TiendaEnLinea2 {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        final var COMPRAMINIMA = 1000;
        System.out.print("valor de la compra: ");
        var valorCompra = Double.parseDouble(consola.nextLine());
        System.out.print("tienes membresía de la tienda: ");
        var membresia = Boolean.parseBoolean(consola.nextLine());
        var descuento = 0.0;
        if (valorCompra > COMPRAMINIMA && membresia){
            descuento = 0.1;
        }
        else if (membresia) {
            descuento = 0.05;
        }
        else {
            descuento = 0.0;
        }
        if (descuento != 0){
            var montoDescuento = valorCompra*descuento;
            var montoFinal = valorCompra - montoDescuento;
            System.out.printf("""
                    %nFelicidades!, has obtenido un descuento del %.0f%%
                    Monto de la compra: $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f%n
                    """,descuento*100,valorCompra,montoDescuento,montoFinal);
        }
        else {
            System.out.printf("""
                    %nNo obtuvistes ningun tipo de descuento.
                    Te invitamos a hacerte miembro de la tienda!
                    Monto final de la compra: $%.2f%n
                    """, valorCompra);
        }
    }
}
