import java.util.Scanner;

public class ValoresMatriz {
    public static void main(String[] args) {
        //introducir valores a una matriz
        int filas,columnas;
        var consola = new Scanner(System.in);
        //definir matriz
        System.out.println("Proporciona los Filas: ");
        filas = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona las Columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[filas][columnas];
        //solicitas los valores
        for (var ren=0;ren <filas;ren++){
            for (var col=0;col<columnas;col++){
                System.out.print("valor["+ren+"]["+col+"] = ");
                matriz[ren][col]=Integer.parseInt(consola.nextLine());
            }
        }
        System.out.println();
        for (var ren=0;ren < filas;ren++){
            for (var col =0;col<columnas;col++) {
                System.out.println("matriz ["+col+"]["+ren+"] = "+matriz[ren][col]);
            }
        }
    }
}
