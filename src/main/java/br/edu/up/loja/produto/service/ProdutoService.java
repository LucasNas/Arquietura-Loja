package br.edu.up.loja.produto.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.up.loja.produto.entity.Produto;
import br.edu.up.loja.produto.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> listar() {
		return produtoRepository.findAll();			
	}

	public void salvar(Produto produto) {
		produtoRepository.save(produto);
	}

	public Optional<Produto> listarId(int id) {
		return produtoRepository.findById(id);
	}

	public void remove(List<Produto> produto) {
		Iterator<Produto> carrinhoIterator = produto.iterator();
		while(carrinhoIterator.hasNext()) {
			if(produtoRepository.findById(carrinhoIterator.next().getId()).isPresent()) {
				Produto product = produtoRepository.findById(carrinhoIterator.next().getId()).get();
				product.setQuantidade(product.getQuantidade()-1);
				produtoRepository.save(product);
			}
		}
		
	}

}
