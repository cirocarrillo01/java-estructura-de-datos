import java.util.Scanner;

public class IdentificaEstacionAño {
    public static void main(String[] args) {
        System.out.println(" ----- identifica la estación del año ----- ");
        var consola = new Scanner(System.in);

        System.out.println("ingresa un mes del año (1-12) para identificar su estación: ");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = (0<mes&&mes<=2||mes==12)?"invierno":(2<mes&&mes<=5)?"primavera":
                (5<mes&&mes<=8)?"verano":(8<mes&&mes<=11)?"otoño":"desconocida";
        System.out.printf("la estacion del mes %d es: %s",mes,estacion);

    }
}
