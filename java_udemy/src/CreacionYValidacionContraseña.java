import java.util.Scanner;

public class CreacionYValidacionContraseña {
    public static void main(String[] args) {
        System.out.println("---- creacion y validacion de contraseña ----");
        var consola = new Scanner(System.in);
        System.out.println("ingresa contraseña de al menos 6 caracteres: ");
        var contraseña = consola.nextLine();
        while (contraseña.length()<6) {
            System.out.println("el password no cumple con los requisitos. "+ "\ndebe tener almenos 6 caracteres");
            System.out.println("ingresa un nuevo valor de contraseña: ");
            contraseña = consola.nextLine();
        }
        System.out.printf("el valor de la contraseña es valido: %s",contraseña);
    }
}
