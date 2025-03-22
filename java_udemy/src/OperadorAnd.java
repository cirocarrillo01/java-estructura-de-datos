public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("---- operador and ----");
        boolean a = true,b=false;
        // and(regresa true si ambos valores son true)
        System.out.println("a = true - b = false");
        var resultado = a && b;
        System.out.println("a && b: " + resultado);
        var resultado1 = a && a;
        System.out.println("a && a: " + resultado1);
        var resultado2 = b && b;
        System.out.println("b && b: " + resultado2);
        var resultado3 = b && a;
        System.out.println("b && a: " + resultado3);

    }
}
