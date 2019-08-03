package br.edu.up.loja.carrinho.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Carrinho")
public class Carrinho {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "cliente")
	private int cliente;
	
	@Column(name = "produto")
	private List<Integer> produto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public List<Integer> getProduto() {
		return produto;
	}

	public void setProduto(List<Integer>produto) {
		this.produto = produto;
	}
	
	public void addProduto(List<Integer>produto) {
		this.produto.addAll(produto);
	}
	
	public void removeProduto(List<Integer>produto) {
		this.produto.removeAll(produto);
	}
	
	
}
