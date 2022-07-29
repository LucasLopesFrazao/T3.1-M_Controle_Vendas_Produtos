package modelo;

public class Produto {
	
	private Integer id;
	private Double preco;
	private Integer qtdEstoque;
	private String nome;
	
	public Produto() {
		
	}

	public Produto(Integer id, Double preco, Integer qtdEstoque, String nome) {
		this.id = id;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		this.nome = nome;
	}
	
	public Produto(Integer id, Double preco, String nome) {
		this.id = id;
		this.preco = preco;
		this.nome = nome;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarEstoque(Integer quantidade) {
		this.qtdEstoque += quantidade;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", preco=" + preco + ", qtdEstoque=" + qtdEstoque + ", nome=" + nome + "]";
	}
	
	
}