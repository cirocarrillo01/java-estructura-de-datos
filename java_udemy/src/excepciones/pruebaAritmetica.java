package excepciones;

public class pruebaAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, 2);
            System.out.println("resultado =" + resultado);
        }catch (Exception e){//se ejecuta si hay un error
            System.out.println("ocurrio un error"+ e);
        }
        finally {//siempre seva ejecutar
            System.out.println("Se reviso la division entre cero");
        }
    }
}
