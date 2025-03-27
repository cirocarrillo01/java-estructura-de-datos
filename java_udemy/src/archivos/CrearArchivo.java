package archivos;

import java.io.File;//input-output
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            if (archivo.exists()){
                System.out.println("el archivo ya existe!");
            }
            else {
                var salida = new PrintWriter(new FileWriter(archivo));
                //se gueardo el archivo a disco duro
                salida.close();
                System.out.println("se ha creado el archivo");
            }
        }catch (IOException e){
            System.out.println("error al crear archivo: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
