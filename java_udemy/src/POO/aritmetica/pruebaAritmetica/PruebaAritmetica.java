package POO.aritmetica.pruebaAritmetica;

import POO.aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("--- Ejemplo Aritmetica ---");
        var aritmetica = new Aritmetica(5,7);
        System.out.println("Atributo operando1: "+aritmetica.getOperando1());//get mirar
        aritmetica.setOperando1(10);//set modifica
        aritmetica.setOperando2(15);
        aritmetica.suma();
        aritmetica.resta();
        System.out.println();
        //creamos un segundo objeto
        var aritmetica1 = new Aritmetica(12,16);
        aritmetica1.suma();
    }
}
