import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //var enteros = new int[]{100, 200, 300, 400, 500};
        // iterar elementos
        /*for (var i = 0; i < enteros.length; i++) {
            System.out.println("valor en el indice: "+i+" = "+enteros[i]);
        */
        //introducir valores al arreglo
        var consola = new Scanner(System.in);
        //declarar el arreglo
        System.out.println("proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        // creamos una manera dinamica del arreglo
        var enteros = new int[largoArreglo];
        //solicitar los valores del arreglo
        for (var i = 0; i < largoArreglo; i++) {
            System.out.print("proporcione enteros[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        // imprimir los valores del arreglo
        System.out.println("\nimpresion del arreglo: ");
        for (var i = 0; i < largoArreglo; i++) {
            System.out.println("enteros[" + i + "] = " + enteros[i]);
        }
    }
}