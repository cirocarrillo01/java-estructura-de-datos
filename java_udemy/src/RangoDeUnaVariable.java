import java.util.Scanner;

public class RangoDeUnaVariable {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("proporciona un dato entero: ");
        var dato = Integer.parseInt(consola.nextLine());

        //Revisamos si esta dentro de rango (entre 1 y 10)
        var estaDentroRango = dato >= 1 && dato <= 10;
        System.out.println("Variable dentro de rango (1 y 10)?: "+estaDentroRango);

        // Revisar la logica inversa si el dato esta fuera de rango
        var estaFueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("esta Fuera Rango entre 1 y 10: " + estaFueraRango);

    }
}
