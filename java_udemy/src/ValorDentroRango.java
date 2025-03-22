import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println(" --- Valor Dentro Rango --- ");
        // definimos los limites
        final var MINIMO = 0;
        final var MAXIMO = 5;
        // solicitar un valor entre 0 y 5
        System.out.print("Proporciona un dato entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        // verificar si el dato esta dentro de rango
        var estaDentrorango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("Esta dentro del rango: " + estaDentrorango);
    }
}
