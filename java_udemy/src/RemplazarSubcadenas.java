public class RemplazarSubcadenas {
    public static void main(String[] args) {
        // reemplazar subcadenas
        var cadena = "Hola Mundo";
        System.out.println("cadena original = "+ cadena);
        // reemplazar "mundo" por "a todos"
        var nuevaCadena = cadena.replace("Mundo","a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        // reemplazar "Hola" por sa subcadena "Adios"
        nuevaCadena = cadena.replace("Hola","Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
