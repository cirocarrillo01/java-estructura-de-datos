package TemasAvanzados;

public class ClaseAbstracta {
    public static void main(String[] args) {
        //FiguraGeometrica figuraGeometrica=new FiguraGeometrica() {
        //    @Override
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
        }
    }
//clase abstracta
abstract class FiguraGeometrica{//no se pueden instancia
    public abstract void dibujar();
}
class Rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("se dibuja un Rectangulo: ");
    }
}

class Circulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("se debe dibujar un circulo: ");
    }
}

