public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // mas formas de concatenar cadena en java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        // metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);
        // StringBuilder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

        // StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        var resultado2 = stringBuffer.toString();
        System.out.println("resultado stringBuffer = " + resultado2);

        //join
        var resultado3 = String.join(" ",cadena1,cadena2,"Adios!");
        System.out.println("resultado = " + resultado3);
    }
}
