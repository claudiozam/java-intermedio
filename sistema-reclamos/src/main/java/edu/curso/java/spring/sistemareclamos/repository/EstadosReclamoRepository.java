package edu.curso.java.spring.sistemareclamos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.curso.java.spring.sistemareclamos.bo.EstadoReclamo;
import edu.curso.java.spring.sistemareclamos.bo.Reclamo;

@Repository
public interface EstadosReclamoRepository extends CrudRepository<EstadoReclamo, Long> {

}
