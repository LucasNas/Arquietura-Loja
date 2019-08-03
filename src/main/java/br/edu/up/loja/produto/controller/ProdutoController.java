package br.edu.up.loja.produto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.loja.produto.entity.Produto;
import br.edu.up.loja.produto.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/getall")
	public List<Produto> listar(){
		return produtoService.listar();
	}
	
	@GetMapping("/{id}")
	public Optional<Produto> listarId(int id){
		return produtoService.listarId(id);
	}
	
	@PostMapping("/cadastrar")
	public void cadastrar(@RequestBody Produto produto) {
		produtoService.salvar(produto);
	}
	
	@PostMapping("/editar/{id}")
	public void editar(@RequestAttribute Produto produto) {
		produtoService.salvar(produto);
	}
}
