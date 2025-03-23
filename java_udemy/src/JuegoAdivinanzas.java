import java.util.Random;
import java.util.Scanner;
public class JuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println(" ----- Juego de Adivinanzas ----- ");
        var consola = new Scanner(System.in);
        Random randon = new Random();
        var intento = 0;
        var numero = 0;
        final var MAXIMOINTENTOS = 5;
        int numeroAleatorio = randon.nextInt(50)+1;
        System.out.println("tines 5 intentos");
        System.out.printf("\nnumero de intento: %d\n",intento);
            while (numeroAleatorio != numero && intento <MAXIMOINTENTOS) {
                System.out.print("ingrese un numero del (1 - 50): ");
                numero = consola.nextInt();
                if (numero < numeroAleatorio) {
                    System.out.println("numero secreto es mayor a "+numero);
                } else
                    System.out.println("numero secreto es menor a "+numero);
                ++intento;
                System.out.printf("\nnumero de intento: %d\n",intento);
            }
            if (numero == numeroAleatorio){
                System.out.printf("Felicidades,"+
                        "adivinaste el numero secreto en el intento: %d",intento);
            }
            else {
                System.out.printf("lo siento, has hagotado los intentos maximos: %d",MAXIMOINTENTOS);
                System.out.printf("\nel numero secreto era: %d",numeroAleatorio);
            }
    }
}