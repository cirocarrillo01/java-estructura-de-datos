import java.util.Scanner;

public class SistemaAutentificacion {
    public static void main(String[] args) {
        final var USER = "ciro";
        final var PASSWORD = "ciro123";
        System.out.println("---- sistema de autentificacion ----");
        Scanner consola = new Scanner(System.in);
        System.out.print("cual es tu usuario: ");
        var datoUser = consola.nextLine().trim();
        System.out.print("cual es tu password: ");
        var datoPassword = consola.nextLine().trim();

        var evaluacion = datoUser.equals(USER) && datoPassword.equals(PASSWORD);
        System.out.print("Datos son correctos: "+ evaluacion);

    }
}
