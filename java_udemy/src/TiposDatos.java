public class TiposDatos {
    public static void main(String[] args) {
        //tipos de datos en java
        
        //enteros(su valor por default es 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 9876543210L;//L - l para indicar qu es long
        System.out.println("tipoLong = " + tipoLong);
        
        // punto flotante(su valor por default es 0)
        float tipoFloat = 3.14F;//F - f para indicar que es float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D;//D - d para indicar tipo double(opcional)
        
        //caracter(valor por default'\u0000')
        char tipochar = 'A';//character del juego unicode
        System.out.println("tipochar = " + tipochar);
        tipochar = 65;//numero de la letra A
        System.out.println("tipochar = " + tipochar);
        tipochar = '@';
        System.out.println("tipochar = " + tipochar);

        // boolean(false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);
        //tipos object (referencia)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "lucas";
        System.out.println("nombre = " + nombre);
        
        
    }
}
