import java.util.Scanner;
public class AplicacionCajeroAutomatico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var saldo = 1000.0;
        var salir = false;
        while (!salir){
            System.out.print("""
                    ----- cajero automatico -----
                    1. depositar
                    2. retirar
                    3. consultar
                    4. salir
                    escoge una opcion:\s
                    """);
            var opcion = consola.nextInt();
            switch (opcion){
                case 1 ->{
                    System.out.printf("Ingresaste a Deposito\nsaldo actual: $%.2f%n",saldo);
                    System.out.print("ingresa saldo: ");
                    var deposito = consola.nextDouble();
                    saldo+=deposito;
                    System.out.println("nuevo saldo: $"+saldo);
                }
                case 2 ->{
                    System.out.printf("ingresaste a retiro\nsaldo actual: $%.2f%n",saldo);
                    System.out.print("ingresa saldo: ");
                    var retiro = consola.nextDouble();
                    if (retiro>saldo)
                        System.out.println("error, saldo insuficiente");
                    else{
                        saldo-=retiro;
                        System.out.printf("nuevo saldo: $%.2f%n%n",saldo);
                    }
                }
                case 3 ->{
                    System.out.println("Ingresaste a consultar\nsaldo actual: $"+saldo);
                }
                case 4 ->{
                    System.out.println("saliendo del sistema");
                    salir=true;
                }
                default -> System.out.println("opcion invalida\n");
            }
        }
        System.out.println("Fin del sistema de cajero");
    }
}
