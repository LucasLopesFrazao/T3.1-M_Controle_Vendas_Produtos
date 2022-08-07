package modelo;

public class Vendedor extends PessoaAbstrata{
	
	//ATRIBUTOS
	private String departamento;
	
	//CONSTRUTORES
	public Vendedor() {
		
	}
	
	public Vendedor(Integer id, String nome, String email, String departamento) {
		super.setId(id);
		super.setNome(nome);
		super.setEmail(email);
		this.departamento = departamento;
	}

	//GETTERS E SETTERS
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Vendedor [departamento=" + departamento + ", getId()=" + getId() + ", getNome()=" + getNome()
				+ ", getEmail()=" + getEmail() + "]";
	}
}