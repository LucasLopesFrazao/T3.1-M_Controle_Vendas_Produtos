package modelo;

public class Cliente extends Pessoa{

	private String cpf;
	private Endereco endereco;
	
	public Cliente() {
		
	}
	
	public Cliente(Integer id, String nome, String email, String cpf) {
		super.setId(id);
		super.setNome(nome);
		super.setEmail(email);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void cadastrarEndereco(Endereco endereco) {
		setEndereco(endereco);
	}
}
