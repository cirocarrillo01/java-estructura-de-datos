public class Matrices {
    public static void main(String[] args) {
        //definimos una matriz
        //int[][] matriz =new int[2][3];
        var matriz = new int [][]{{100,200,300},{400,500,600}};
        // modificar los valores de la matriz
        // recorrer una matriz
        for (var ren =0;ren< matriz.length;ren++)
            for (var col=0;col< matriz[ren].length;col++)
                System.out.println("valor["+ren+"]["+col+"] = "+matriz[ren][col]);
    }
}