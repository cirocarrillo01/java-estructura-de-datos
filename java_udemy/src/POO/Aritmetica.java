package POO;

public class Aritmetica {
    int operando1;
    int operando2;

    public Aritmetica(){//no sale void, Strint, int solo llamarse igual a la clase
        System.out.println("Ejecutando Constructor Vacio");
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
        var aritmetica = new Aritmetica();
        aritmetica.operando1=5;
        aritmetica.operando2=7;
        aritmetica.suma();
        aritmetica.resta();
        var aritmetica1 = new Aritmetica();
        aritmetica1.operando1=12;
        aritmetica1.operando2=16;
        aritmetica1.suma();
        aritmetica1.resta();
    }
}
