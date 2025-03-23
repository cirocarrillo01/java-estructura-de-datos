import java.util.Scanner;

public class MayorDosNumeros {
    public static void main(String[] args) {
        System.out.println("--- el mayor de dos numeros ---");
        var consola = new Scanner(System.in);
        System.out.print("ingrese el primer valor: ");
        var valor1 = Integer.parseInt(consola.nextLine());
        System.out.print("ingrese el segundo valor: ");
        var valor2 = Integer.parseInt(consola.nextLine());
        var comparacion = (valor1>valor2)?valor1:(valor2>valor1)?valor2:"son iguales";
        System.out.printf("""
                %ncomparacion de dos numeros
                el primer numero: %d
                el segundo numero: %d
                el resultado de la comparacio es: %s
                """,valor1,valor2,comparacion);
    }
}
