package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false;
        var nombreArchivo="mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            //Revisar si existe el archivo
            anexar=archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo,anexar));
            var nuevoContenido = "nuevo\ncontenido";
            salida.println(nuevoContenido);
            salida.close();
            System.out.println("se agrego contenido al archivo ...");
        }catch (Exception e){
            System.out.println("error al escribir al archivo. ");
            e.printStackTrace();
        }


    }
}
