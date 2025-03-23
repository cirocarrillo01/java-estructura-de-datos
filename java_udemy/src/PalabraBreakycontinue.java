public class PalabraBreakycontinue {
    public static void main(String[] args) {
        System.out.println("---- break y continue ----");
        // ejemplo de break.
        for(var numero = 1; numero <10; numero++){
            if (numero %2 == 0){
                System.out.print(numero+ " ");
                break;
            }
        }

        // ejemplo con continue. imprimir solo numeors pares, ignora impares
        System.out.println("\npalabra continue: ");
        for (var numero = 1; numero < 10; numero++){
            if(numero % 2 == 1){
                continue;//continua con la sigiente iteracion
            }
            System.out.print(numero + " ");//numeros pares
        }
    }
}