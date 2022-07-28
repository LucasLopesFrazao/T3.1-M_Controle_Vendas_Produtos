package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;

public class BancoDadosCliente {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public BancoDadosCliente() {
		clientes.add(new Cliente(1, "Marcelo Ot�vio Assis", "marcelo78@hersa.com.br", "878.745.654-11", "41306-065",
				"Salvador", "Vila das Margaridas", "229", "Nova Bras�lia de Val�ria", "BA"));
		
		clientes.add(new Cliente(2, "Isadora Elaine", "isadora-elaine@foar.unesp.br", "619.021.645-55", "79790-970",
				"Deod�polis", "Avenida Dom Pedro II 530", "229", "Centro", "MS"));
		
		clientes.add(new Cliente(3, "Vera Brenda Barros", "vera_barros@leanclean.com.br", "428.047.520-20", "63901-110",
				"Quixad�", "Planalto Renascer", "865", "Rua da Crian�a", "CE"));
	}
	
	public Cliente pesquisarCliente(String cpf) {
		Cliente cliente = new Cliente();
		for(Cliente c: clientes) {
			if(c.getCpf().equals(cpf)) {
				cliente = c;
			}
		}
		return cliente;
	}
	
	public void excluirCliente(String cpf) {
		int loop = 0;
		for(Cliente c: clientes) {
			if(c.getCpf().equals(cpf)) {
					clientes.remove(loop);					
					break;
			}
			loop += 1;
		}
	}
	
	public Integer ultimoCodigoCadastrado() {		
		return clientes.get((clientes.size() - 1)).getId();
	}
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public List<Cliente> obterTodosClientes(){
		return clientes;
	}
	
	public boolean checarId(Integer id) {
		for(Cliente c: clientes) {
			if(c.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public void editarCliente(Cliente cliente) {
		for(Cliente c: clientes) {
			if(c.getId() == cliente.getId()) {
				c.setId(cliente.getId());
				c.setNome(cliente.getNome());
				c.setEmail(cliente.getEmail());
				c.setCpf(cliente.getCpf());
				c.getEndereco().setCep(cliente.getEndereco().getCep());
				c.getEndereco().setCidade(cliente.getEndereco().getCidade());
				c.getEndereco().setEndereco(cliente.getEndereco().getEndereco());
				c.getEndereco().setNumero(cliente.getEndereco().getNumero());
				c.getEndereco().setBairro(cliente.getEndereco().getBairro());
				c.getEndereco().setUf(cliente.getEndereco().getUf());
				
			}
		}
	}
	
}
