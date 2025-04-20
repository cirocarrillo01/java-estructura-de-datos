package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

//@SpringBootApplication //Desactivar
public class ZonaFitApplication implements CommandLineRunner {
	@Autowired
	private IClienteServicio clienteServicio;
	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);
	String nl= System.lineSeparator();
	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion");
		// levantar la fabrica de spring
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("Aplicacion finalizada!");
	}
	@Override
	public void run(String... args) throws Exception {
		zonaFitApp();
	}
	private void zonaFitApp(){
		var salir = false;
		var consola = new Scanner(System.in);
		while (!salir){
			var opcion = mostraMenu(consola);
			salir = ejecutarOpciones(consola,opcion);
			logger.info(nl);
		}
	}
	private int mostraMenu(Scanner consola){
		logger.info("""
		\n--- Aplicacion Zona Fit(GYM) ---
			1. listar cliente
			2. buscar cliente
			3. agregar cliente
			4. modificar cliente
			5. eliminar cliente
			6. salir
			Elige una opcion:\s""");
		return Integer.parseInt(consola.nextLine());
	}
	private boolean ejecutarOpciones(Scanner consola, int opcion){
		var salir = false;
		switch (opcion){
			case 1 -> {
				logger.info(nl + "--- listado de clientes: " + nl);
				List<Cliente>clientes = clienteServicio.listarClientes();
				clientes.forEach(cliente -> logger.info(cliente.toString()+nl));
			}
			case 2 -> {
				logger.info(nl+"--- Buscar cliente por id ---"+nl);
				logger.info("id cliente a buscar: ");
				var idCliente = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
				if (cliente != null)
					logger.info("cliente encontrado: "+ cliente+ nl);
				else
					logger.info("cliente no encontrado: "+ cliente+ nl);
			}
			case 3 -> {
				logger.info("--- Agregar Cliente ---"+nl);
				logger.info("Nombre: ");
				var nombre = consola.nextLine();
				logger.info("Apellido: ");
				var apellido = consola.nextLine();
				logger.info("Membresia: ");
				var membresia = Integer.parseInt(consola.nextLine());
				var cliente = new Cliente();
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setMembresia(membresia);
				clienteServicio.guardarCliente(cliente);
				logger.info("cliente agregado: " + cliente+nl);
			}
			case 4 -> {
				logger.info("--- Modificar Cliente ---"+nl);
				logger.info("id cliente: ");
				var idCliente = Integer.parseInt(consola.nextLine());
				Cliente cliente= clienteServicio.buscarClientePorId(idCliente);
				if (cliente!=null){
					logger.info("nombre: ");
					var nombre = consola.nextLine();
					logger.info("apellido: ");
					var apellido = consola.nextLine();
					logger.info("membresia: ");
					var membresia = Integer.parseInt(consola.nextLine());
					cliente.setNombre(nombre);
					cliente.setApellido(apellido);
					cliente.setMembresia(membresia);
					clienteServicio.guardarCliente(cliente);
					logger.info("Cliente modificado. "+cliente+nl);
				}
				else
					logger.info("Cliente no encontrado"+cliente+nl);
			}
			case 5 -> {
				logger.info("--- Eliminar cliente ---"+nl);
				logger.info("id cliente: ");
				var idCliente = Integer.parseInt(consola.nextLine());
				var cliente = clienteServicio.buscarClientePorId(idCliente);
				if (cliente!=null){
					clienteServicio.eliminarCliente(cliente);
					logger.info("cliente eliminado: "+ cliente+nl);
				}
				else logger.info("Cliente no encontrado: "+cliente+nl);
			}
			case 6 ->{
				logger.info("Hasta pronto!"+nl+nl);
				salir=true;
			}
			default -> logger.info("opcion no reconocida: "+opcion+nl);
		}
		return salir;
	}
}
