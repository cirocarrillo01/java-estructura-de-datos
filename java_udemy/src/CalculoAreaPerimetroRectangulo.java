import java.util.Scanner;

public class CalculoAreaPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println("--- calcular area y perimetro de un rectangulo ---");
        Scanner consola = new Scanner(System.in);
        System.out.print("ingrese la altura del rectangulo: ");
        var altura = Integer.parseInt(consola.nextLine().trim());
        System.out.print("ingresa la base del rectangulo: ");
        var base = Integer.parseInt(consola.nextLine().trim());
        var area = base * altura;
        var perimetro = 2*(base+altura);
        System.out.println("perimetro del rectangulo: " + perimetro);
        System.out.println("area del rectangulo: " + area);
    }
}
