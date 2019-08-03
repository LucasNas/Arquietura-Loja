package br.edu.up.loja.carrinho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.loja.carrinho.entity.Carrinho;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Integer> {

}
