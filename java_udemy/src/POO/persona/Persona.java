package POO.persona;

public class Persona {
    public static void main(String[] args) {
        System.out.println("--- creacion de clases y objetos persona ---");
        System.out.println("variable estaica: "
                +PruebaPersona.getContadorPersonas());
        var objeto2 = new PruebaPersona("layla","acosta");
        System.out.println(objeto2);
        System.out.println("variable estatica: "+PruebaPersona.getContadorPersonas());
        //Segundo Objeto
        var objeto1= new PruebaPersona("ian","gomez");
        System.out.println(objeto1);
        System.out.println("variables estaticas: "
                +PruebaPersona.getContadorPersonas());
    }
}
