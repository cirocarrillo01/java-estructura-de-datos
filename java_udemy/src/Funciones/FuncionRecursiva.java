package Funciones;

public class FuncionRecursiva {
    //imprimir 1 al 5 usando una funcion recursiva
    //funcion recursiva
    static void funcionRecursiva(int numero){
        //caso base
     if(numero==1)
         System.out.print(numero+" ");
     else{
         funcionRecursiva(numero-1);
         System.out.print(numero+" ");
        }
    }
    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}