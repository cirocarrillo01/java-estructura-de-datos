import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("---- promedio de calificaciones ----");
        var consola = new Scanner(System.in);
        System.out.println("proporcione el numero de notas: ");
        var notasCantidad = Integer.parseInt(consola.nextLine());
        var enteros = new int[notasCantidad];
        for (var i=0;i<notasCantidad;i++){
            System.out.print("la nota: ["+i+"]: ");
            enteros[i]=Integer.parseInt(consola.nextLine());
        }
        var sumaPromedio=0;
        for(var j =0;j<notasCantidad;j++){
           sumaPromedio+=enteros[j];
        }
        var promedio = sumaPromedio/notasCantidad;
        System.out.printf("\nel promedio de las notas: %d",promedio);
    }
}
