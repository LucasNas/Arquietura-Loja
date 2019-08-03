package br.edu.up.loja.cliente.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.up.loja.cliente.entity.Cliente;
import br.edu.up.loja.cliente.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}

	public void salvar(Cliente cliente) {
		clienteRepository.save(cliente);
		
	}

	public Optional<Cliente> listarId(int id) {
		return clienteRepository.findById(id);
	}
	
}
