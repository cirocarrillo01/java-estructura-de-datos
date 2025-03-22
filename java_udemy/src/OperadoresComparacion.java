public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("--- operadores de comparacion ---");
        int a=2,b=3;
        // igualdad ==
        var resultado = a == b;
        System.out.println("resultado a == b: " + resultado);
        //Distinto !=
        resultado = a != b;
        System.out.println("resultado a!=b: " + resultado);
        //mayor que
        resultado = a>b;
        System.out.println("resultado a>b: " + resultado);
        //mayor o igual
        resultado = a>=b;
        System.out.println("resultado a>=b: " + resultado);
        //menor que
        resultado = a<b;
        System.out.println("resultado a<b: " + resultado);
        //menor o igual que
        resultado = a<=b;
        System.out.println("resultado a<=b: " + resultado);



    }
}
