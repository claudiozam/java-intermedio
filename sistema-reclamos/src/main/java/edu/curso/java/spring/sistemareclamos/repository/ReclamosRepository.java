package edu.curso.java.spring.sistemareclamos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import edu.curso.java.spring.sistemareclamos.bo.Reclamo;

@Repository
public interface ReclamosRepository extends CrudRepository<Reclamo, Long> {

	@Query(value = "select r from Reclamo r")
	public List<Reclamo> buscarTodosLosReclamos();
	
}
