package POO.animales;

public class Animal {
    protected void comer() {
        System.out.println("Como muchas veces al dia");
    }
    protected void dormir(){
        System.out.println("Duermo muchas horas");
    }
}
class perro extends Animal{
    public void hacerSonido(){
        System.out.println("puedo ladrar");
    }
    //modificar el comportamiento heredado
    @Override
    protected void dormir() {
        System.out.println("duermo 15 horas al dias");
        System.out.println("Metodo de la clase padre:");
        super.dormir();//palabra super llama el comportamiento sobreescrito de clase padre
    }
}
class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("--- ejemplo de herencia ---");
        System.out.println("clase padre, soy un animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();

        System.out.println("clase hija, soy un perro");
        var perro1= new perro();
        perro1.hacerSonido();
        perro1.comer();
        perro1.dormir();
    }
}
