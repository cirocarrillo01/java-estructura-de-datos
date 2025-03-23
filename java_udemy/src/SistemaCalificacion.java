import java.util.Scanner;

public class SistemaCalificacion {
    public static void main(String[] args) {
        System.out.println("----- Sistema de Calificacion -----");
        var consola = new Scanner(System.in);
        System.out.println("ingresa el valor de la nota (0 - 10): ");
        var nota = Integer.parseInt(consola.nextLine());
        var calificacion = switch (nota){
            case 9,10 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            case 0,1,2,3,4,5 -> "F";
            default -> "valor desconocido";
        };
        System.out.printf("la calificacion %d es %s",nota,calificacion);
    }
}
