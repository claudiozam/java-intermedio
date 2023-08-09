package edu.curso.java.spring.sistemareclamos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.curso.java.spring.sistemareclamos.bo.Cliente;
import edu.curso.java.spring.sistemareclamos.repository.ClientesRepository;

@SpringBootApplication
public class SistemaReclamosApplication implements CommandLineRunner {
 
	@Autowired
	private ClientesRepository clientesRepository;

	public static void main(String[] args) {
		SpringApplication.run(SistemaReclamosApplication.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
	
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Ejemplo cliente 1");
		
		clientesRepository.save(cliente1);
		System.out.println("Id cliente generado: " + cliente1.getId());
		
		List<Cliente> clientes = clientesRepository.buscarTodosLosClientes();
		for (Cliente c : clientes) {
			System.out.println(c.getId() + " " + c.getNombre());
		}
		
	}
	
		
		

}
