public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("--- operador or ---");
        boolean a = true, b = false;
        System.out.println("a = true - b = false");
        var resultado = a||b;
        System.out.println("resultado a or b: " + resultado);
        var resultado1 = a||a;
        System.out.println("resultado a or b: " + resultado1);
        var resultado2 = b||b;
        System.out.println("resultado a or b: " + resultado2);
        var resultado3 = b||a;
        System.out.println("resultado a or b: " + resultado3);
    }
}
