public class InmutabilidadCadenas {
    public static void main(String[] args) {
        // inmutabilidad de cadena
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = cadena1;
        cadena1 = "Adios";
        System.out.println("cadena1 modificado = " + cadena1);
        System.out.println("cadena2 = " + cadena2);

    }
}
