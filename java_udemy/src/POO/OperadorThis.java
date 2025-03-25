package POO;

public class OperadorThis {
    int operando1;
    int operando2;
    public OperadorThis(){//sobrecarga de constructores

    }
    public OperadorThis(int operando1,int operando2){//no sale void, Strint, int solo llamarse igual a la clase
        System.out.println("Ejecutando Constructor Vacio");
        this.operando1=operando1;
        this.operando2=operando2;
        System.out.println("unicacion de this: "+this);
    }//constructor publicó lo agrega de manera automatica, constructor vacio
    void suma(){
        var resultado = this.operando1+this.operando2;
        System.out.println("el resultado de la suma: "+resultado);
    }
    void resta(){
        var resultado = this.operando1-this.operando2;
        System.out.println("el resultado de la resta: "+resultado);
    }
    public static void main(String[] args) {
        System.out.println("--- Ejemplo Aritmetica ---");
        var aritmetica = new OperadorThis(5,7);
        //aritmetica.operando1=5;
        //aritmetica.operando2=7;
        aritmetica.suma();
        aritmetica.resta();
        System.out.println("Dir. memoria objeto: "+aritmetica);
        //creamos un segundo objeto
        var aritmetica1 = new OperadorThis(12,16);
        aritmetica1.suma();
        System.out.println("Dir. memoria objeto2: "+aritmetica1);



    }
}