import java.util.Scanner;

public class SistemaDeEnvio {
    public static void main(String[] args) {
        System.out.println("----- Sistema de Envios -----");
        final var TARIFANACIONAL = 10;
        final var TARIFAINTERNACIONAL = 20;
        var consola = new Scanner(System.in);
        System.out.println("El destino es nacional o internacional");
        var destino = consola.nextLine().trim().toLowerCase();
        System.out.println("peso del paquete (Kg): ");
        var peso = Double.parseDouble(consola.nextLine());
        var costoEnvio = switch (destino){
            case "nacional" -> peso*TARIFANACIONAL;
            case "internacional" -> peso*TARIFAINTERNACIONAL;
            default -> {
                System.out.println("destino invalido. Ingresa nacional/internacional");
                yield null;
            }
        };
        if (costoEnvio != null)
            System.out.printf("El costo de envio de paquete: $ %.2f",costoEnvio);



    }
}
