public class OperadoresDeAsignacion {
    public static void main(String[] args) {
        System.out.println("----- operadores de asignacion -----");
        // Asignacion =
        var miNumero = 10;
        int muNumero2;
        //miNumero2 = 15;
        //Asignacion compuesto
        // +=
        miNumero += 5;//miNumero = miNumero + 5;
        System.out.println("miNumero = " + miNumero);
        //-=, *=, /=, %=
        miNumero *= 2;
        System.out.println("miNumero = " + miNumero);
        // Asignacion de variables multiples
        int a=10, b=15, c=20;
        System.out.printf("a = %d, b = %d, c = %d",a,b,c);

    }
}
