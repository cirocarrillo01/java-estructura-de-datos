import java.util.Scanner;

public class AplicacionCalculadores {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        double operador1=0,operador2=0;
        var salir = false;
        while (!salir){
            System.out.print("""
                    \n---- calculadora ----
                    1. suma
                    2. resta
                    3. multiplicacion
                    4. division
                    5. salir
                    escoge una opcion:\s
                    """);
            var opcion = consola.nextInt();
            if (opcion>=1&&opcion<=4){
                System.out.print("ingrese operador 1: ");
                operador1 = consola.nextDouble();
                System.out.print("ingrese operador 2: ");
                operador2 = consola.nextDouble();
            }
            switch (opcion){
                case 1 ->{
                    System.out.println("operacion suma: ");
                    System.out.printf("Resultado: %s",(operador1+operador2));
                }
                case 2 ->{
                    System.out.println("operacion resta: ");
                    System.out.printf("Resultado: %s",(operador1-operador2));
                }
                case 3 -> {
                    System.out.println("operacion multiplicacion: ");
                    System.out.printf("Resultado: %s",(operador1*operador2));
                }
                case 4 -> {
                    System.out.println("operacion division: ");
                    if (operador1 == 0 || operador2 == 0)
                        System.out.println("error! no se divide por cero");
                    else
                        System.out.printf("Resultado: %.2f",(operador1/operador2));
                }
                case 5 -> {
                    System.out.println("salir del programa");
                    salir=true;
                }
                default -> System.out.println("opcion invalida");
            }
        }
        System.out.println("fin de la calculadora");
    }
}
