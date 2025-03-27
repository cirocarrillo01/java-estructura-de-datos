package TemasAvanzados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List <String>milista = new ArrayList<>();//picoparentesis
        milista.add("Lunes");
        milista.add("Martes");
        milista.add("Miercoles");
        milista.add("Jueves");
        milista.add("Viernes");
        milista.add("Sabado");
        milista.add("Domingo");
        //permite elementos duplicados//cambia object por String
        //for(Object elemento:milista)
        /*for (String elemento:
             milista) {
            System.out.println("Dia de la semana: "+ elemento);
        }*/
        //funcion lamda(funcion anonima de un codigo muy compacto)
        /*milista.forEach(elemento->{
            System.out.println("elemento: "+elemento);
        });*/

        //metodo de referencia
        milista.forEach(System.out::println);
        //lista sin agregar metodos
        List<String>nombres = Arrays.asList("Pedro","Ivonne","Nohemi");
        System.out.println("\nlista de nombres:");
        nombres.forEach(System.out::println);

    }
}
