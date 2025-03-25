package POO.aritmetica;

public class Aritmetica{
    private int operando1;//encapsulamiento
    private int operando2;
    public Aritmetica(){//sobrecarga de constructores
    }
    public Aritmetica(int operando1, int operando2){//no sale void, Strint, int solo llamarse igual a la clase
        System.out.println("Ejecutando Constructor Vacio");
        this.operando1=operando1;
        this.operando2=operando2;
    }//constructor publicó lo agrega de manera automatica, constructor vacio
    public void suma(){
        var resultado = this.operando1+this.operando2;
        System.out.println("el resultado de la suma: "+resultado);
    }
    public void resta(){
        var resultado = this.operando1-this.operando2;
        System.out.println("el resultado de la resta: "+resultado);
    }
    public int getOperando1(){
        return this.operando1;
    }
    public void setOperando1(int operando1){
        this.operando1=operando1;
    }
    public int getOperando2(){
        return this.operando2;
    }
    public void setOperando2(int operando2){
        this.operando2=operando2;
    }
}
