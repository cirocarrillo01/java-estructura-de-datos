import java.util.Random;

public class NumeroAleatorios {
    public static void main(String[] args) {
        System.out.println("---- numeros Aleatorios ----");
        var random = new Random();
        
        // Generar un numero aleatorio entre 0 y 9;
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numero Aleatorio 0 y 9: " + numeroAleatorio);

        // Generar un numero aleatorio entre 1 y 10
        var numeroAleatorio1 = random.nextInt(10)+1;
        System.out.println("numero Aleatorio 1 y 10: " + numeroAleatorio1);

        // generar un numero flotante entre 0.0 y 1.0
        var flotanteAleatorio = random.nextInt();
        System.out.println("flotante Aleatorio 0.0 a 1.0: " + flotanteAleatorio);

        // simular el lanzamiento de un dado(1 y 6)
        var dado = random.nextInt(6)+1;
        System.out.println("lanzamiendo de un dado: " + dado);

    }
}
