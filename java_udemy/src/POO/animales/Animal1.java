package POO.animales;

public class Animal1 {
    protected void hacerSonido(){
        System.out.println("el animal hace un sonido");
    }
}
class perro1 extends Animal1{
    @Override
    protected void hacerSonido(){
        System.out.println("el perro hace wouf");
    }
}
class gato1 extends Animal1{
    @Override
    protected void hacerSonido() {
        System.out.println("el gato hace miau");
    }
}
class PruebaAnimal1{
    //metodo polimorfico
    static void imprimirSonido(Animal1 animal){
        animal.hacerSonido();
    }
    public static void main(String[] args) {
        var animal=new perro1();
        var animal1=new gato1();
        imprimirSonido(animal);
        imprimirSonido(animal1);
    }
}
