public class BusquedaSubcadenas {
    public static void main(String[] args) {
        // Buscar subcadenas
        // indexOF - Devuelve el indice de la priera aparicion de la subcadena
        var cadena1 = "Hola Mundo";
        // subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        // lastIndexOF - devuelve el indice de la ultima aparicion de la subcadena
        // subcadena de mundo
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        // subcadena no encontrada devulve -1
        var indice3 = cadena1.indexOf("java");
        System.out.println("indice3 = " + indice3);
        var indice4 = cadena1.lastIndexOf("java");
        System.out.println("indice3 = " + indice4);
    }
}
