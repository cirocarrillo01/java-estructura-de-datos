import java.util.Scanner;

public class mes {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Proporciona el valor del mes (1-12): ");
        var mes = Integer.parseInt(consola.nextLine());

        var estacion = switch (mes){
            case 1,2,12 -> "invierno";
            case 3,4,5 -> "primavera";
            case 6,7,8 -> "verano";
            case 9,10,11 -> "otoño";
            default -> "estacion desconocidad";
        };
        System.out.printf("la estacion para el mes %d es %s",mes,estacion);
    }
}
