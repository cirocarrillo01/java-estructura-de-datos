import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("--- sistema prestamo libros ---");
        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.println("cuentas con credenciales de estudiente (true/false): ");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.println("a cuento km vives de la biblioteca?: ");
        var distanciaBibliotecaKm = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo = tienesCredencial || distanciaBibliotecaKm <= DISTANCIA_PERMITIDA_KM;
        System.out.println("eres elegible para prestamo de libros?: " + esElegiblePrestamo);

    }
}
