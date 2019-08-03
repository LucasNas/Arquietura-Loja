package br.edu.up.loja.carrinho.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.edu.up.loja.carrinho.entity.Carrinho;
import br.edu.up.loja.carrinho.repository.CarrinhoRepository;
import br.edu.up.loja.produto.entity.Produto;
import br.edu.up.loja.produto.repository.ProdutoRepository;
import br.edu.up.loja.produto.service.ProdutoService;


@Service
public class CarrinhoService {
	
	@Autowired
	private CarrinhoRepository carrinhoRepository;

	public List<Carrinho> listar() {
		return carrinhoRepository.findAll();
	}

	public void salvar(Carrinho carrinho) {
		carrinhoRepository.save(carrinho);
	}

	public Optional<Carrinho> listarId(int id) {
		return carrinhoRepository.findById(id);
	}

	public void salvarProduto(List<Produto> produto, int id) {
		 final String uri = "http://localhost:8080/produto/remove/{id}";
		if(carrinhoRepository.findById(id).isPresent()) {
			List<Integer> produtos = new ArrayList<Integer>();
			Carrinho carrinho = carrinhoRepository.findById(id).get();
			Iterator<Produto> carrinhoIterator = produto.iterator();
			while(carrinhoIterator.hasNext()) {
				produtos.add(carrinhoIterator.next().getId());
			}
			carrinho.addProduto(produtos);
			RestTemplate restTemplate = new RestTemplate();
			
		}
	}
	
}
