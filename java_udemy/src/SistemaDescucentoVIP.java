import java.util.Scanner;

public class SistemaDescucentoVIP {
    public static void main(String[] args) {
        System.out.println("--- sistema de descuentos VIP ---");
        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.println("cuantos productos comprastes hoy: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.println("tienes la membresia de la tienda (true/false)?: ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tienesMembresia;
        System.out.println("tienes acceso al descuento VIP?: "+esElegibleDescuento);

    }
}
