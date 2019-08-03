package br.edu.up.loja.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.loja.produto.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
