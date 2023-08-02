package edu.curso.java.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.*;

public class Principal {

	public static void main(String[] args) {
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction(); //INIO DE LA TRANSACTION
		
		//EJEMPLO DE ALTA DE ESTADO DE RECLAMO
		//EstadoReclamo estadoReclamo = new EstadoReclamo();
		//estadoReclamo.setNombre("Resuelto");
		//session.save(estadoReclamo);
		//****************************************************
		
		//ALTA DE CLIENTES
		//Cliente cliente1 = new Cliente();
		//cliente1.setNombre("Juan Perez");
		//session.save(cliente1);
		
		//Cliente cliente2 = new Cliente();
		//cliente2.setNombre("Maria Lopez");
		//session.save(cliente2);
		//****************************************************
		
		
		//EJEMPLO DE ALTA DE RECLAMO
//		Long idEstadoReclamoNuevo = 1L;
//		EstadoReclamo estadoReclamoNuevo = session.load(EstadoReclamo.class, idEstadoReclamoNuevo);
//		
//		Long idClienteJuanPerez = 5L;
//		Cliente clienteJuanPerez = session.load(Cliente.class, idClienteJuanPerez);
//		
//		Reclamo reclamo = new Reclamo();
//		reclamo.setEstadoReclamo(estadoReclamoNuevo);
//		reclamo.setFechaDeAlta(new Date()); //TOMA LA FECHA Y HORA ACTUAL DE LA PC!!!!
//		reclamo.setTitulo("Ejemplo de reclamo 1");
//		reclamo.setDescripcion("Este es un ejemplo mas largo de texto para el reclamo");
//		session.save(reclamo);
//		
//		clienteJuanPerez.getReclamos().add(reclamo); //ESTOY AGREGANDO UN RECLAMO AL CLIENTE
//		session.update(clienteJuanPerez);
//		
		//****************************************************

		
		Long idReclamoBuscar = 7L;
		Reclamo reclamo = session.load(Reclamo.class, idReclamoBuscar);

		System.out.println("Id: " + reclamo.getId());
		System.out.println("Titulo: " + reclamo.getTitulo());
		System.out.println("Descripcion: " + reclamo.getDescripcion());
		System.out.println("Estado del reclamo " + reclamo.getEstadoReclamo().getNombre());
		System.out.println("Fecha alta: " + reclamo.getFechaDeAlta());
		
		
		
		//****************************************************

		
		transaction.commit(); 
		session.close(); 
		HibernateUtil.close();

	}

}
