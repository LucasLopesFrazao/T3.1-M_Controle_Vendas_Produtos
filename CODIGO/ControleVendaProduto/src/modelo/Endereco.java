package modelo;

public class Endereco {

	private String cep;
	private String endereco;
	private String numero;
	private String bairro;
	private String cidade;
	private String uf;
	
	public Endereco() {
		
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", endereco=" + endereco + ", numero=" + numero + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", uf=" + uf + "]";
	}
	
}