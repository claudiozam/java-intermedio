package edu.curso.java.hibernate;

import org.hibernate.*;

public class Principal {

	public static void main(String[] args) {
		
		
		Session session = null; //TODO: FALTA CONFIGURAR HIBERNATE!!!!!
		Transaction transaction = session.beginTransaction(); //INIO DE LA TRANSACTION
		
		Producto producto1 = new Producto();
		producto1.setNombre("Ejemplo1");
		producto1.setDescripcion("Ejemplo de producto con hibernate");
		producto1.setPrecio(5000.0);
		
		session.save(producto1); //GRABA EL OBJETO PRODUCTO EN LA BASE DE DATOS!!!!!
		
		System.out.println("ID Autogenerado por hibernate: " + producto1.getId());
		
		transaction.commit(); // CONFIRMA LOS CAMBIOS EN LA BASE DE DATOS
		// transaction.rollback(); // PUEDO BORRAR LOS CAMBIOS SI NO LOS QUIERO!!!!!
		
		session.close(); //SIEMPRE TENGO QUE CERRAR LA SESSION DESPUES DE TRABAJAR!!!!!

	}

}
