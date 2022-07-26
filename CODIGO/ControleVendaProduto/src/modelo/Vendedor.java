package modelo;

public class Vendedor extends Pessoa{

	private String departamento;
	
	public Vendedor() {
		
	}
	
	public Vendedor(Integer id, String nome, String email, String departamento) {
		super.setId(id);
		super.setNome(nome);
		super.setEmail(email);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Id = "
			+ super.getId()
			+ " Nome = "
			+ super.getNome()
			+ " E-mail = "
			+ super.getEmail()
			+ " Departamento = "
			+ this.departamento;
	}
	
	
}