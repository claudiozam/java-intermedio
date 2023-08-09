package edu.curso.java.spring.sistemareclamos.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.curso.java.spring.sistemareclamos.bo.Cliente;

import java.util.*;

@Repository
public interface ClientesRepository extends CrudRepository<Cliente, Long> {

	
	@Query(value = "select c from Cliente c")
	public List<Cliente> buscarTodosLosClientes();

	
	@Query(value = "select c from Cliente c where c.nombre = :nombre")
	public List<Cliente> buscarClientesPorNombre(@Param("nombre") String nombre);

	@Query(value = "select c from Cliente c where c.nombre like %:nombre%")
	public List<Cliente> buscarClientesPorNombreLike(@Param("nombre") String nombre);

	
}
