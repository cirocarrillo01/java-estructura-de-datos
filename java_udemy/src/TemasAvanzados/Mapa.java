package TemasAvanzados;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String,String> persona = new HashMap<>();
        //llaves y valores = diccionario
        persona.put("nombre","Diego");
        persona.put("apellido","flores");
        persona.put("edad","31");
        //no permite duplicados
        persona.put("edad","31");
        System.out.println("Valores de mapa: ");
        persona.entrySet().forEach(System.out::println);
        System.out.println();
        persona.put("edad","35");//modificar el valor de la llave existente
        persona.remove("apellido");
        persona.entrySet().forEach(System.out::println);

        System.out.println("\nNuevos valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        //Iterar sobres los elementos del mapa por separado
        System.out.println("\n Iterando los elementos(llave,valor)");
        persona.forEach((llave,valor)->{
            System.out.println("llave: "+llave+", valor: "+valor);
        });


    }
}
