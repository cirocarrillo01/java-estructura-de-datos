import java.util.Random;
import java.util.Scanner;

public class SistemaGeneradorID {
    public static void main(String[] args) {
        System.out.println("----- sistema generador de ID unico -----");
        var consola = new Scanner(System.in);
        Random random = new Random();

        System.out.print("ingresa tu nombre: ");
        var nombre = consola.nextLine().trim();
        System.out.print("ingresa tu apellido:  ");
        var apellido = consola.nextLine().trim();
        System.out.print("ingresa tu año de nacimiento(aaaa): ");
        var anioNacimiento = consola.nextLine().trim();

        int cuatroDigitos = random.nextInt(10000);
        var cadena1 = nombre.substring(0,2).toUpperCase();
        var cadena2 = apellido.substring(0,2).toUpperCase();
        var cadena3 = Integer.parseInt(anioNacimiento.substring(2,4));
        var mensaje = """
                %nhola %s
                
                \ttu nuevo numero de identifficacion(ID) geneado por el sistema por: 
                \t%s%s%d%04d
                \tfelicidades!
                """.formatted(nombre,cadena1,cadena2,cadena3,cuatroDigitos);
        System.out.println(mensaje);

    }
}
