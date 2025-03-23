import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("--- bienvenido a la casa de los espejs ---");
        var consola = new Scanner(System.in);
        System.out.println("cual es tu edad?: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.println("Tienes miedo a la oscuridad (true/false)? ");
        var tienesMiedoOscuridad = Boolean.parseBoolean(consola.nextLine());

        if (!tienesMiedoOscuridad && edad >= 10) {
            System.out.println("puedes entrar a la casa de los espejos");
        }
        else {
            System.out.println("lo siento, la casa de los espejos podria darte miedo");
        }
    }
}
