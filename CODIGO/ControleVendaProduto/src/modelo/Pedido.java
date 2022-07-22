package modelo;

public class Pedido {

	private Produto produto;
	private Integer quantidade;
	private Double  precoTotal;
	
	public Pedido() {
		
	}

	public Pedido(Produto produto, Integer quantidade, Double precoTotal) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.precoTotal = precoTotal;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	public void subtotal() {
		// TODO
		this.precoTotal = produto.getPreco() * quantidade;
	}
	
	public void adicionarProduto(Produto produto) {
		setProduto(produto);
	}
}
