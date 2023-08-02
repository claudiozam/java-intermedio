package edu.curso.java.hibernate;

import java.util.List;

import org.hibernate.*;

public class Principal {

	public static void main(String[] args) {
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction(); //INIO DE LA TRANSACTION
		
		//EJEMPLO DE ALTA DE ESTADO DE RECLAMO
		EstadoReclamo estadoReclamo = new EstadoReclamo();
		estadoReclamo.setNombre("Resuelto");
		session.save(estadoReclamo);
		
		transaction.commit(); 
		session.close(); 
		HibernateUtil.close();

	}

}
