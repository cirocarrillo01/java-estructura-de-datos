package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.Scanner;
public class ZonaFitApp {
    public static void main(String[] args) {
        zonaFitApp();
    }
    public static void zonaFitApp() {
        var salir = false;
        var consola = new Scanner(System.in);
        // creamos un objeto de la clase cliente
        IClienteDAO clienteDao = new ClienteDAO();
        while (!salir){
            try {
                var opcion = mostarMenu(consola);
                salir = ejecutarOpciones(consola,opcion,clienteDao);
            }catch (Exception e){
                System.out.println("Error al ejecutar opciones: "+e.getMessage());
            }
            System.out.println();
        }
    }
    private static int mostarMenu(Scanner consola){
        System.out.println("""
                --- zona fit (GYM)
                1. Listar Clientes
                2. Buscar Cliente
                3. Agregar Cliente
                4. Modificar Cliente
                5. Eliminar Cliente
                6. salir
                Elijir una opcion:\s""");
        var opcion =Integer.parseInt(consola.nextLine().strip());
        return opcion;
    }
    private static boolean ejecutarOpciones(Scanner consola, int opcion, IClienteDAO clienteDAO){
        var salir=false;
        switch (opcion){
            case 1 -> { //1. listar cliente
                System.out.println("--- listado de cliente ---");
                var clientes = clienteDAO.listarClientes();
                clientes.forEach(System.out::println);
            }
            case 2 -> {//2. Buscar Cliente
                System.out.println("introduce el id del cliente a buscar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var encontrado = clienteDAO.buscarClientePorId(cliente);
                if (encontrado)
                    System.out.println("Cliente encontrado: "+cliente);
                else
                    System.out.println("cliente no encontrado: "+cliente);
            }
            case 3 -> { // 3. agregar cliente
                System.out.println("--- Agregar Cliente ---");
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());
                //creamos el objeto cliente(sin el id)
                var cliente = new Cliente(nombre,apellido,membresia);
                var agregado=clienteDAO.agregarCliente(cliente);
                if (agregado)
                    System.out.println("cliente agregado: "+cliente);
                else
                    System.out.println("cliente NO agregado: "+cliente);
            }
            case 4 -> {//4. modificar cliente
                System.out.println("--- modificar cliente ---");
                System.out.print("id Cliente: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                System.out.print("nombre: ");
                var nombre = consola.nextLine();
                System.out.print("apellido: ");
                var apellido = consola.nextLine();
                System.out.print("membresia: ");
                var membresia= Integer.parseInt(consola.nextLine());
                //creamos el objeto modificar
                var cliente = new Cliente(idCliente,nombre,apellido,membresia);
                var modificado = clienteDAO.modificarCliente(cliente);
                if (modificado)
                    System.out.println("cliente modificado "+cliente);
                else
                    System.out.println("no se modifico cliente "+cliente);
            }
            case 5 -> {// 5. eliminar cliente
                System.out.println("--- eliminar cliente ---");
                System.out.print("id cliente: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var eliminado = clienteDAO.eliminarCliente(cliente);
                if (eliminado)
                    System.out.println("cliente eliminado: "+cliente);
                else
                    System.out.println("cliente no eliminado: "+cliente);
            }
            case 6 ->{ // 6. salir
                System.out.println("salio del sistema");
                salir=true;
            }
            default -> System.out.println("opcion no validad");
        }
        return salir;
    }
}