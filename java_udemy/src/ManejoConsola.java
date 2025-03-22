import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        //introduccir valores por consola
        var consola = new Scanner(System.in);//in -input-entrada estandadr
        System.out.print("escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre: "+nombre);
    }
}
