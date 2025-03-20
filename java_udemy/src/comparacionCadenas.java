public class comparacionCadenas {
    public static void main(String[] args) {
        // comparacion de cadenas (pool de cadena)
        var cadena1 = "java";
        var cadena2 = "java";
        var cadena3 = new String("java");
        // comparacion de cadenas (==) compara la referencia en memoria
        System.out.print("cadena1 es igual en referencia a cadena2: " );
        System.out.println(cadena1 == cadena2);
        // comparacion cadena 1 con cadena2(referencia)
        System.out.print("cadena1 es igual a referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);
        //comparar contenido usando el metodo equals
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));


    }
}
