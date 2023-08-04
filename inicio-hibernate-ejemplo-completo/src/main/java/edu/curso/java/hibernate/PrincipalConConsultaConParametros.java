package edu.curso.java.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.*;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class PrincipalConConsultaConParametros {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction(); //INIO DE LA TRANSACTION
		
		
		System.out.println("**************************************");
		
		Query<Reclamo> reclamosQuery2 = session.createQuery("from Reclamo as r where r.descripcion like :textoDescripcion order by r.fechaDeAlta", Reclamo.class);
		reclamosQuery2.setParameter("textoDescripcion", "%largo%");
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
		
		Query<Reclamo> reclamosQuery3 = session.createQuery("from Reclamo as r where r.estadoReclamo.nombre = :nombreEstado order by r.fechaDeAlta", Reclamo.class);
		reclamosQuery3.setParameter("nombreEstado", "Nuevo"); 
		List<Reclamo> reclamos3 = reclamosQuery3.list();
		
		for (Reclamo reclamo : reclamos3) {
			System.out.println("Id: " + reclamo.getId());
			System.out.println("Titulo: " + reclamo.getTitulo());
			System.out.println("Descripcion: " + reclamo.getDescripcion());
			EstadoReclamo estadoReclamoActual = reclamo.getEstadoReclamo();
			System.out.println("Estado del reclamo " + estadoReclamoActual.getNombre());
			System.out.println("Fecha alta: " + reclamo.getFechaDeAlta());		
		}

		Query<Cliente> queryUnSoloCliente = session.createQuery("from Cliente as c where c.nombre = :nombreBuscar", Cliente.class);
		queryUnSoloCliente.setParameter("nombreBuscar", "Juan Perez");
		Cliente clienteEncontrado = queryUnSoloCliente.uniqueResult();
		System.out.println("Nombre: " + clienteEncontrado.getNombre());
		
		System.out.println("**************************************");

		Query<Long> queryCantidadDeClientes = session.createQuery("select count(*) from Cliente", Long.class);
		Long cantidad = queryCantidadDeClientes.uniqueResult();
		
		System.out.println("Cantidad de clientes: " + cantidad);
		
		
		
		transaction.commit(); 
		session.close(); 
		HibernateUtil.close();

	}

}
