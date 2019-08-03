package br.edu.up.loja.carrinho.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.loja.carrinho.entity.Carrinho;
import br.edu.up.loja.carrinho.service.CarrinhoService;
import br.edu.up.loja.produto.entity.Produto;
import br.edu.up.loja.produto.service.ProdutoService;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {
	
	private CarrinhoService carrinhoService;
	private ProdutoService produtoService;
	
	@GetMapping("/getall")
	public List<Carrinho> listar(){
		return carrinhoService.listar();
	}
	
	@GetMapping("/{id}")
	public Optional<Carrinho> listarId(int id){
		return carrinhoService.listarId(id);
	}
	
	@PostMapping("/cadastrar")
	public void cadastrar(@RequestBody Carrinho carrinho) {
		carrinhoService.salvar(carrinho);
	}
	
	@PostMapping("/id")
	public void addProduto(@RequestBody List<Produto> produto, int id) {
		carrinhoService.salvarProduto(produto,id);
		produtoService.remove(produto);
	}
	

}
