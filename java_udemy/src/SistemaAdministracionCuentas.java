import java.util.Scanner;
public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        // comenzamos la iteracion del menu
        while (!salir){
            System.out.print("""
                    --- sistema de administracion de cuentas ---
                    Menu:
                    1. crear cuenta
                    2. eliminar cuenta
                    3. salir
                    escoge una opcion:\s
                    """);
            var opcion= consola.nextInt();
            switch (opcion){
                case 1 -> System.out.print("crando tu cuenta...\n");
                case 2 -> System.out.print("eliminando tu cuenta...\n");
                case 3 -> {
                    System.out.print("saliendo del sistema. Hasta pronto!");
                    salir=true;
                }
                default -> System.out.print("opcion invalidad...\n");
            }
        }
        System.out.println("Fin del sistema de administracion de cuentas!");
    }
}