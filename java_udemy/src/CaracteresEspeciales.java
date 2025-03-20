public class CaracteresEspeciales {
    public static void main(String[] args) {
        //caracteres especialiales
        //\n salto de linea
        var cadena1 = "Hola \nMundo";
        System.out.println("Cadena1 = " + cadena1);
        
        // '\t' tabulacion
        var cadena2 = "\tHola \tMundo";
        System.out.println("cadena2 = " + cadena2);
        
        // \' comilla simple
        var cadena3 = "Hola \'Mundo\'";
        System.out.println("cadena3 = " + cadena3);
        
        // '\"' agregar una comilla doble
        var cadena4 = "Hola \"Mundo\"";
        System.out.println("cadena4 = " + cadena4);
        
        // '\\' caracter de barra invertida
        var cadena5 = "Hola \\ Mundo";
        System.out.println("cadena5 = " + cadena5);
        
    }
}
