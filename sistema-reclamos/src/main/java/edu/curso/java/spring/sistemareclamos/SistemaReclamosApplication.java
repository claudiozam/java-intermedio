package edu.curso.java.spring.sistemareclamos;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import edu.curso.java.spring.sistemareclamos.bo.Cliente;
import edu.curso.java.spring.sistemareclamos.bo.EstadoReclamo;
import edu.curso.java.spring.sistemareclamos.bo.Reclamo;
import edu.curso.java.spring.sistemareclamos.repository.ClientesRepository;
import edu.curso.java.spring.sistemareclamos.repository.EstadosReclamoRepository;
import edu.curso.java.spring.sistemareclamos.repository.ReclamosRepository;

@SpringBootApplication
public class SistemaReclamosApplication implements CommandLineRunner {
 
	@Autowired
	private ClientesRepository clientesRepository;

	@Autowired
	private EstadosReclamoRepository estadosReclamoRepository;
	
	@Autowired
	private ReclamosRepository reclamosRepository;
	  
	public static void main(String[] args) {
		SpringApplication.run(SistemaReclamosApplication.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
	
		/*
		EstadoReclamo estadoReclamo1 = new EstadoReclamo();
		estadoReclamo1.setNombre("Nuevo");

		EstadoReclamo estadoReclamo2 = new EstadoReclamo();
		estadoReclamo2.setNombre("Pendiente");

		EstadoReclamo estadoReclamo3 = new EstadoReclamo();
		estadoReclamo3.setNombre("Cerrado");
		
		
		estadosReclamoRepository.save(estadoReclamo1);
		estadosReclamoRepository.save(estadoReclamo2);
		estadosReclamoRepository.save(estadoReclamo3);
		
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("pedro lopez");
		clientesRepository.save(cliente1);
		System.out.println("Id cliente generado: " + cliente1.getId());
		

		Reclamo reclamo1 = new Reclamo();
		reclamo1.setTitulo("Reclamo 1");
		reclamo1.setDescripcion("Ejemplo 12345 Ejemplo 12345");
		reclamo1.setEstadoReclamo(estadoReclamo1);
		reclamo1.setFechaDeAlta(new Date());
		
		reclamosRepository.save(reclamo1);
		
		cliente1.getReclamos().add(reclamo1);
		clientesRepository.save(cliente1);
		*/
		
	}
	
		
		

}
