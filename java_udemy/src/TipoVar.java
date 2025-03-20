public class TipoVar {
    public static void main(String[] args) {
        System.out.println("uso de var en java");
        //sin el uso de var
        String nombre1 = "ciro";
        System.out.println("nombre1 = " + nombre1);
        // con el uso de var
        var nombre2 = "antonio";
        System.out.println("nombre2 = " + nombre2);
        //Definir otras variables usando
        var edad = 30;//se infiere el tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5f;//se infiere el tipo float
        System.out.println("sueldo = " + sueldo);
        var esCasado = false;//se infiere tipo boolean
        esCasado = true;

        // se debe definir su valor
        /* var precio;
        precio=10;
        */

        // se debe poder inferir el tipo de dato
        // var apellidos = null; no se puede inferir el tipo de dato


    }
}
