package edu.curso.java.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.*;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

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


//		Long idReclamoBuscar = 7L;
//		Reclamo reclamo = session.load(Reclamo.class, idReclamoBuscar);
//
//		System.out.println("Id: " + reclamo.getId());
//		System.out.println("Titulo: " + reclamo.getTitulo());
//		System.out.println("Descripcion: " + reclamo.getDescripcion());
//		System.out.println("Estado del reclamo " + reclamo.getEstadoReclamo().getNombre());
//		System.out.println("Fecha alta: " + reclamo.getFechaDeAlta());		
		
		//EJEMPLO DE CONSULTA CON HQL
//		Query<EstadoReclamo> estadosReclamoQuery = session.createQuery("from EstadoReclamo", EstadoReclamo.class);
//		List<EstadoReclamo> estadosReclamo = estadosReclamoQuery.list();
//		for (EstadoReclamo estadoReclamo : estadosReclamo) {
//			System.out.println("Id " + estadoReclamo.getId() + " Nombre " + estadoReclamo.getNombre());
//		}
//		
//		System.out.println("**************************************");
//
//		//EJEMPLO DE CONSULTA CON SQL
//		NativeQuery<EstadoReclamo> estadosReclamoQueryNative = session.createSQLQuery("select * from EstadoReclamo");
//		estadosReclamoQueryNative.addEntity(EstadoReclamo.class);
//		List<EstadoReclamo> estadosReclamoSQL = estadosReclamoQueryNative.list();
//		for (EstadoReclamo estadoReclamo : estadosReclamoSQL) {
//			System.out.println("Id " + estadoReclamo.getId() + " Nombre " + estadoReclamo.getNombre());
//		}
//		//****************************************************
//
//		System.out.println("**************************************");

		
		Query<Reclamo> reclamosQuery1 = session.createQuery("from Reclamo as r order by r.fechaDeAlta", Reclamo.class);
		List<Reclamo> reclamos1 = reclamosQuery1.list();
		
		for (Reclamo reclamo : reclamos1) {
			System.out.println("Id: " + reclamo.getId());
			System.out.println("Titulo: " + reclamo.getTitulo());
			System.out.println("Descripcion: " + reclamo.getDescripcion());
			EstadoReclamo estadoReclamoActual = reclamo.getEstadoReclamo();
			System.out.println("Estado del reclamo " + estadoReclamoActual.getNombre());
			System.out.println("Fecha alta: " + reclamo.getFechaDeAlta());		
		}

		System.out.println("**************************************");
		
		Query<Reclamo> reclamosQuery2 = session.createQuery("from Reclamo as r where r.descripcion like '%largo%' order by r.fechaDeAlta", Reclamo.class);
		List<Reclamo> reclamos2 = reclamosQuery2.list();
		
		for (Reclamo reclamo : reclamos2) {
			System.out.println("Id: " + reclamo.getId());
			System.out.println("Titulo: " + reclamo.getTitulo());
			System.out.println("Descripcion: " + reclamo.getDescripcion());
			EstadoReclamo estadoReclamoActual = reclamo.getEstadoReclamo();
			System.out.println("Estado del reclamo " + estadoReclamoActual.getNombre());
			System.out.println("Fecha alta: " + reclamo.getFechaDeAlta());		
		}

		System.out.println("**************************************");
		
		Query<Reclamo> reclamosQuery3 = session.createQuery("from Reclamo as r where r.estadoReclamo.nombre = 'Nuevo' order by r.fechaDeAlta", Reclamo.class);
		List<Reclamo> reclamos3 = reclamosQuery3.list();
		
		for (Reclamo reclamo : reclamos3) {
			System.out.println("Id: " + reclamo.getId());
			System.out.println("Titulo: " + reclamo.getTitulo());
			System.out.println("Descripcion: " + reclamo.getDescripcion());
			EstadoReclamo estadoReclamoActual = reclamo.getEstadoReclamo();
			System.out.println("Estado del reclamo " + estadoReclamoActual.getNombre());
			System.out.println("Fecha alta: " + reclamo.getFechaDeAlta());		
		}

		System.out.println("**************************************");		
		
		Query<Cliente> clienteQuery4 = session.createQuery("select c from Cliente as c inner join c.reclamos as r where r.estadoReclamo.nombre = 'Nuevo' order by r.fechaDeAlta", Cliente.class);
		List<Cliente> clientes4 = clienteQuery4.list();
		for (Cliente cliente : clientes4) {
			System.out.println("Cliente: " + cliente.getId() + " - Nombre: " + cliente.getNombre());
		}

		System.out.println("**************************************");		

		@SuppressWarnings("unchecked")
		NativeQuery<Cliente> consultaSQLClientesConReclamos = session.createSQLQuery("select c.* from Cliente c inner join Cliente_Reclamo cr on c.id = cr.Cliente_id " + 
				" inner join Reclamo r on cr.reclamos_id= r.id " + 
				" cross join EstadoReclamo e where r.estadoReclamo_id = e.id and e.nombre='Nuevo'");
		consultaSQLClientesConReclamos.addEntity(Cliente.class);
		List<Cliente> clientes5 = consultaSQLClientesConReclamos.list();

		for (Cliente cliente : clientes5) {
			System.out.println("Cliente: " + cliente.getId() + " - Nombre: " + cliente.getNombre());
		}
		
		transaction.commit(); 
		session.close(); 
		HibernateUtil.close();

	}

}

