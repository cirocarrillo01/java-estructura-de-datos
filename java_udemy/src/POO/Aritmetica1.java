package POO;

public class Aritmetica1 {
    int operando1;
    int operando2;
    public Aritmetica1(){//sobrecarga de constructores

    }
   public Aritmetica1(int op1,int op2){//no sale void, Strint, int solo llamarse igual a la clase
        System.out.println("Ejecutando Constructor Vacio");
        operando1=op1;
        operando2=op2;
    }//constructor publicó lo agrega de manera automatica, constructor vacio

    void suma(){
        var resultado = operando1+operando2;
        System.out.println("el resultado de la suma: "+resultado);
    }
    void resta(){
        var resultado = operando1-operando2;
        System.out.println("el resultado de la resta: "+resultado);
    }
    public static void main(String[] args) {
        System.out.println("--- Ejemplo Aritmetica ---");
        var aritmetica = new Aritmetica1(5,7);
        //aritmetica.operando1=5;
        //aritmetica.operando2=7;
        aritmetica.suma();
        aritmetica.resta();
        //creamos segundo objeto
        System.out.println();
        var aritmetica1= new Aritmetica1();
        aritmetica1.operando1=12;
        aritmetica1.operando2=8;
        aritmetica1.suma();

   }
}