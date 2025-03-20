public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println(" ------ Generador de Email ------ ");
        var nombre = "Ciro Antonio Carrillo Mendoza";
        var empresa = "Norte Digital";
        var dominio = "com.co";
        System.out.println("nombre de usuario: " + nombre);
        var cadena1 = nombre.trim().toLowerCase().replace(' ','.');
        System.out.println("nombre de usuario normalizado: " + cadena1);
        System.out.println();
        System.out.println("nombre de empresa: " + empresa);
        System.out.println("extension de dominio: " +"."+ dominio);
        var cadena2 = empresa.trim().toLowerCase().replace(' ','.');
        var cadena3 = "@"+cadena2+"."+dominio;
        System.out.println("Dominio de Email normalizado: " + cadena3);
        System.out.println();
        var resultado = String.join("",cadena1,cadena3);
        System.out.println("Email final generado: " + resultado);
        
    }
}
