package TemasAvanzados;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("victoria");
        // Evita los elemento repetidos
        System.out.println("Elementos del Set:");
        conjunto.forEach(System.out::println);
        // Remover elemento
        conjunto.remove("Karla");
        System.out.println("nuevos elementos del set: ");
        conjunto.forEach(System.out::println);
    }
}
