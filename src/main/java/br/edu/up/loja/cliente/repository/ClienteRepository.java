package br.edu.up.loja.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.loja.cliente.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
}
