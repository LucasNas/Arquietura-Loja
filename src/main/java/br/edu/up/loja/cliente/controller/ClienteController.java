package br.edu.up.loja.cliente.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.edu.up.loja.cliente.entity.Cliente;
import br.edu.up.loja.cliente.service.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/getall")
	public List<Cliente> listar(){
		return clienteService.listar();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> listarId(int id){
		return clienteService.listarId(id);
	}
	
	@PostMapping("/cadastrar")
	public void cadastrar(@RequestBody Cliente cliente) {
		clienteService.salvar(cliente);
	}
	
}
