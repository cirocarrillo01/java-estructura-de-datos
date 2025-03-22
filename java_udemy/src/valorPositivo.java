import java.util.Scanner;

public class valorPositivo {
    public static void main(String[] args) {
        System.out.println("--- valor positivo ---");

        var consola = new Scanner(System.in);
        System.out.print("proporciona un numero: ");
        var numero = Integer.parseInt(consola.nextLine());

        if(numero>0){
            System.out.println("el numero es positivo: " + numero);
        }
        else if (numero<0) {
            System.out.println("el numero es negativo: "+ numero);
        }
        else {
            System.out.println("el numero es: "+numero);
        }
    }
}
