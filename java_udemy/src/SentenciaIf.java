public class SentenciaIf {
    public static void main(String[] args) {
        //uso de la sentencia if
        var edad = 10;
        if (edad >= 18) {
            System.out.println("eres mayor de edad. ");
        } else if (edad >= 13 && edad < 18) {
            System.out.println("eres un adolecente. ");
        } else{
            System.out.println("eres menor de edad. ");
        }
    }
}
