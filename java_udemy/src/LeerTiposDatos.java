import java.util.Scanner;
import java.util.*;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //leer distintos tipos de datos
        //leer un tipo int
        var consola = new Scanner(System.in);
        System.out.print("ingrese ti edad: ");
        var edad = consola.nextInt();
        System.out.println("edad: "+edad);
        // leer un tipo double
        System.out.print("ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura: " + altura);
        // consumimos el caracter de salto de linea
        consola.nextLine();
        // leer un tipo string
        System.out.print("ingresa tu nombre: ");
        var nombre =consola.nextLine();
        System.out.println("nombre: " + nombre);
        
        // conversion de datos
        System.out.print("proporciona un valor entero: ");
        //var enterosString = consola.nextLine();
        //var entero = Integer.parseInt(enterosString);
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);
        // tipo flotante
        System.out.print("proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
        //Double.parsenDouble()

    }
}