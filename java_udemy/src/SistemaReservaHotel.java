import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("--- sistema de reserva de hotel ---");
        var consola = new Scanner(System.in);
        final var CONVISTA = 190.50;
        final var SINVISTA = 150.50;
        System.out.print("nombre del cliente: ");
        var cliente = consola.nextLine();
        System.out.print("dias de estancia: ");
        var dias = Integer.parseInt(consola.nextLine());
        System.out.print("cuenta con vista al mar (true/false): ");
        var vista = Boolean.parseBoolean(consola.nextLine());
        var habitacion = (vista == true)?"con vista":"sin vista";
        var valor =(vista==true)?CONVISTA:SINVISTA;
        var valorTotal = dias *valor;
        System.out.printf("""
                %n------ Detalles de Reservacion ------
                Cliente: %s
                Dias de estancia: %d
                Habitacion %s al mar
                costo total: $%.2f
                """,cliente,dias,habitacion,valorTotal);
    }
}
