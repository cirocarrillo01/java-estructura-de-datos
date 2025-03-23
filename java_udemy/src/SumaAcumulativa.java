public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("---- Suma Acumulativa -----");
        final var MAXIMO = 5;
        var acumuladorSuma = 0;
        var numero = 1;
        while(numero <= MAXIMO){
            System.out.println("acumuladorSuma + numero -> "+acumuladorSuma+" + "+numero);
            acumuladorSuma+=numero++;
            System.out.println("Suma parcial acumulada: "+acumuladorSuma+"\n");
        }
        System.out.println("suma de los primeros: "+MAXIMO+" numeros: "+acumuladorSuma);
    }
}