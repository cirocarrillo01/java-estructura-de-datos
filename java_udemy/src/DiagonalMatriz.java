import java.util.Scanner;

public class DiagonalMatriz {
    public static void main(String[] args) {
        int filas,columnas;
        var consola = new Scanner(System.in);
        System.out.println("ingrese datos: ");
        System.out.println("proporciona las filas: ");
        filas=Integer.parseInt(consola.nextLine());
        System.out.println("proporciona las columnas: ");
        columnas=Integer.parseInt(consola.nextLine());
        var matriz = new int[filas][columnas];
        for(var i=0;i<filas;i++){
            for(var j=0;j<columnas;j++){
                System.out.print("valor["+i+"]["+j+"] = ");
                matriz[i][j] = Integer.parseInt(consola.nextLine());
            }
        }
        System.out.println();
        var sumaDiagonal=0;
        for(var i=0;i<filas;i++){
            for(var j=0;j<columnas;j++){
                if (i==j)
                    sumaDiagonal+=matriz[i][j];
            }
        }
        System.out.printf("suma diagonal de la matriz: %d",sumaDiagonal);
    }
}
