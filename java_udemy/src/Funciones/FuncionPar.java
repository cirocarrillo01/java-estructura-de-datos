package Funciones;
import java.util.Scanner;
public class FuncionPar {
    //funcion para saber si un numero es par
    static boolean esPar(int numero){
        return (numero%2==0)?true:false;
    }
    public static void main(String[] args) {
        System.out.println("proporciona un valor numerico: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("numero par? "+esPar(numero));
    }
}