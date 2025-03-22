import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("---- sistema de empleados -----");
        var consola = new Scanner(System.in);
        // nombre del empleado
        System.out.print("ingrese nombre del empleado: ");
        var nombreEmpleado =consola.nextLine();

        // edad del empleado
        System.out.print("edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        // salario del empleado
        System.out.print("salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        //es jefe de departamento
        System.out.print("es jefe de departamento (true/false): ");
        var jefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        //imprimir los valores del empleado
        System.out.println("\nDatos del Empleado: ");
        System.out.println("\tNombre: "+nombreEmpleado);
        System.out.println("\tEdad: "+edadEmpleado);
        //System.out.println("\tSalario: "+salarioEmpleado);
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado);
        System.out.println("\tEs jefe de Departamento: "+jefeDepartamento);
    }
}
