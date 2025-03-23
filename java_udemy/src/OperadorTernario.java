public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("--- operador ternario ---");
        //sintaxis
        //condicion ? exp1 : exp2
        // Determina si un numero es par o no
        var numero = 3;
        var resultado = (numero % 2 == 0)?"par":"impar";
        System.out.println("El numero es: " + resultado);

        //calcular si es mayor de edad
        var edad = 18;
        var mensaje = (edad >= 18)?"Eres mayor de edad":"Eres menor de edad";
        System.out.println("\ntienes "+edad+", "+mensaje);

        // valor positivo, negativo o cero (operador ternario anidado)
        numero = 0;
        resultado = (numero > 0)? "positivo":(numero < 0)?"negativo":"cero";
        System.out.println("\nEl numero "+numero+" es "+resultado);

    }
}
