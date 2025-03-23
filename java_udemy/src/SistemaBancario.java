import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("--- binvenido al sistema bancario ---");
        var consola = new Scanner(System.in);

        System.out.println("Deseas salir del sistema (true/false): ");
        var salirsistema = Boolean.parseBoolean(consola.nextLine());

        // vaificamos (aplicando una logica inversa)
        if (!salirsistema){
            System.out.println("continuamos dentro del sistema");
        }
        else {
            System.out.println("salimos del sistema....");
        }
    }
}
