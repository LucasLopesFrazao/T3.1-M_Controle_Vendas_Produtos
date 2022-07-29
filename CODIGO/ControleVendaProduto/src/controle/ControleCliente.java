package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;

public class ControleCliente {
	
	//ATRIBUTOS
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	//CONSTRUTOR COM SEMEA��O DO "BANCO DE DADOS".
	public ControleCliente() {
		clientes.add(new Cliente(1, "Marcelo Ot�vio Assis", "marcelo78@hersa.com.br", "353.559.630-05", "41306-065",
				"Salvador", "Vila das Margaridas", "229", "Nova Bras�lia de Val�ria", "BA"));
		
		clientes.add(new Cliente(2, "Isadora Elaine", "isadora-elaine@foar.unesp.br", "619.021.645-55", "79790-970",
				"Deod�polis", "Avenida Dom Pedro II 530", "229", "Centro", "MS"));
		
		clientes.add(new Cliente(3, "Vera Brenda Barros", "vera_barros@leanclean.com.br", "428.047.520-20", "63901-110",
				"Quixad�", "Planalto Renascer", "865", "Rua da Crian�a", "CE"));
		
		clientes.add(new Cliente(4, "Luiz C�sar Nelson da Costa", "luizcesardacosta@companhiadigital.net", "577.468.789-97", "96830-060",
				"Santa Cruz do Sul", "Rua Igua�u", "963", "Bonfim", "RS"));
		
		clientes.add(new Cliente(5, "Bruna Francisca Rebeca Assis", "bruna.francisca@agencia10.com.br", "007.938.968-60", "68905-170",
				"Macap�", "Rua Santa Maria", "814", "Cidade Nova", "AP"));
	}
	
	//METODOS
	public Integer ultimoCodigoCadastrado() {		
		return clientes.get((clientes.size() - 1)).getId();
	}
	
	public Cliente pesquisarClientePorCPF(String cpf) {
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
