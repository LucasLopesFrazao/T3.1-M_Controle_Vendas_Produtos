package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Vendedor;

public class BancoDadosFuncionario {
	
	private List<Vendedor> vendedores = new ArrayList<Vendedor>();
	
	public BancoDadosFuncionario() {
		vendedores.add(new Vendedor(1, "Vicente Paulo Tomás Nunes", "marcelo78@hersa.com.br", "Celulares"));
		vendedores.add(new Vendedor(2, "Rafael Augusto Baptista", "rafael_augusto_baptista@callan.com.br", "Móveis"));
		vendedores.add(new Vendedor(3, "Carla Gabrielly Vera Ramos", "carla_gabi@yahoo.com.br", "Eletrodomésticos"));
	}
	
	public Integer codUltimoVendedor() {
		return vendedores.get((vendedores.size() - 1)).getId();
	}
	
	public void adicionarVendedor(Vendedor vendedor) {
		vendedores.add(vendedor);
	}
	
	public List<Vendedor> pegarTodosVendedores(){
		return vendedores;
	}
	
	public Vendedor pesquisarPorNome(String nome) {
		for(Vendedor v: vendedores) {
			if(v.getNome().toUpperCase().contains(nome.toUpperCase())) {
				return v;
			}
		}
		return new Vendedor();
	}
	
	public boolean checarId(Integer id) {
		for(Vendedor v: vendedores) {
			if(v.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public void editarVendedor(Vendedor vendedor) {
		for(Vendedor v: vendedores) {
			if(v.getId() == vendedor.getId()) {
				v.setId(vendedor.getId());
				v.setNome(vendedor.getNome());
				v.setEmail(vendedor.getEmail());
				v.setDepartamento(vendedor.getDepartamento());
			}
		}
	}
	
	public void apagarVendedor(Integer id) {
		int loop = 0;
		for(Vendedor v: vendedores) {
			if(v.getId() == id) {
				vendedores.remove(loop);
				break;
			}
			loop += 1;
		}
	}
}
