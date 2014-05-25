package com.pucminas.carofour.model;		

/**
 * @version 0.2
 */

public class ItemPedido {
	private int id;
	private int quantidade;
	private Produto produto;

	public ItemPedido(Produto produto) {
		this.produto = produto;
		this.quantidade = 1;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double valorTotalProduto() {
		return produto.getPreco() * this.quantidade;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedido other = (ItemPedido) obj;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (produto.getId() != other.produto.getId())
			return false;
		return true;
	}
	
}
