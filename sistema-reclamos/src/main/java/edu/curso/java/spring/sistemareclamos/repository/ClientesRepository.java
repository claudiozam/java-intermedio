package edu.curso.java.spring.sistemareclamos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.curso.java.spring.sistemareclamos.bo.Cliente;

@Repository
public interface ClientesRepository extends CrudRepository<Cliente, Long> {

}
