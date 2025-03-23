import java.util.Scanner;

public class SistemaDeAutentificacion {
    public static void main(String[] args) {
        final var USER = "ciro";
        final var PASSWORD = "ciro123";
        var consola = new Scanner(System.in);
        System.out.println("ingrese usuario al sistema: ");
        var usuario = consola.nextLine().strip();
        System.out.println("ingrese contraseña al sistema: ");
        var contraseña = consola.nextLine().strip();
        var identificacion = switch (usuario){
            case USER -> {
                if (PASSWORD.equals(contraseña))
                    yield "bienvenido al sistema";
                else
                    yield "password incorrector, por favor corregirlo";
            }
            default -> {
                if (PASSWORD.equals(contraseña)) {
                    yield "usuario incorrecto, favor de corregirlo";
                }
                else
                    yield "usuario y password incorrectos, favor de corregirlo";
            }
        };
        System.out.println(identificacion);
    }
}
