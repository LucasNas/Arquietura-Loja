package br.edu.up.loja.produto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Produto")
public class Produto {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "produto_id")
	private int id;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "quantidade")
	private int quantidade;
	
	@Column(name = "preco")
	private double preco;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
