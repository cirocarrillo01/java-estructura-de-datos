public class MetodosDeCadenas {
    public static void main(String[] args) {
        // metodo de cadenas
        var cadena1 = "Hola Mundo";
        
        // obteneer el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        // reemplzar caracteres
        var nuevaCadena = cadena1.replace('o','a');
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        // convertit a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        // convertir a minusculas
        System.out.println("minusculas = " + cadena1.toLowerCase());

        //eliminar espacios
        var cadena2 = " ciro carrillo    ";
        System.out.println("cadena2.trim() = " + cadena2.trim());





    }
}
