import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("---- dibuja un triangulo ----");
        var consola = new Scanner(System.in);
        System.out.println("proporciona el numero de filas: ");
        var numeroFilas = consola.nextInt();

        for(var fila = 1;fila <= numeroFilas;fila++){
            var espaciosBlancos = " ".repeat(numeroFilas-fila);
            var asteriscos = "*".repeat(2*fila-1);
            System.out.println(espaciosBlancos+asteriscos);
        }
    }
}
