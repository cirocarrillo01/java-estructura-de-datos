public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("--- formateo de cadena ---");
        var nombre = "Ciro";
        var edad = 50;
        var salario = 2500.25;

        //String.format
        var mensaje = String.format("nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad,salario);
        System.out.println(mensaje);

        //metodoprintf
        System.out.printf("nombre: %s, Edad: %d, salario: $%.2f%n",nombre,edad,salario);
        var numeroEmpleado = 12;
        // Formateo con text block
        mensaje = """
                %nDetalle persona:\s
                ------------------
                \tNombre: %s 
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: %.2f
                """.formatted(nombre,numeroEmpleado,edad,salario);
        System.out.println(mensaje);

        //formateo con text block y print directamente
        System.out.printf("""
                %nDetalle persona:\s
                ------------------
                \tNombre: %s 
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: %.2f
                """,nombre,numeroEmpleado,edad,salario);
        
        
    }
}
