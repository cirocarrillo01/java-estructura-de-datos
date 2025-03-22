import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        System.out.println("----- receta de cocina -----");
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el nombre: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Ingresa los ingredientes: ");
        var ingredientes = consola.nextLine();
        System.out.print("Ingresa el tiempo de preparacion (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());
        System.out.print("ingresa dificultad (facil, medio 0 dificil): ");
        var dificultad = consola.nextLine();
        System.out.println();
        System.out.println("_____ Receta de cocina _____");
        System.out.println("Nombre Receta: "+nombreReceta);
        System.out.println("Ingredientes: "+ingredientes);
        System.out.println("Tiempo de preparacion: "+tiempoPreparacion);
        System.out.println("dificultad: "+dificultad);
    }
}
