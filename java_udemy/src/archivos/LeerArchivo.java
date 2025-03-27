package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        //Leer el archivo
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            System.out.println("contenido del archivo: ");
            //Abrir el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            //leemos linea a linea el archivo
            var linea = entrada.readLine();
            //leemos todas las lineas
            while (linea!=null){
                System.out.println(linea);
                //antes de termianr el ciclo, no movemos a la siguiente linea
                linea=entrada.readLine();
            }
            //cerrar archivo
            entrada.close();
        }catch (Exception e){
            System.out.println("erro al leer el archivo: "+e);
        }
    }
}
