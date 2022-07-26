package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Produto;

public class BancoDadosProdutos {
	
	List<Produto> produtos = new ArrayList<>();
	
	public BancoDadosProdutos() {
		produtos.add(new Produto(1, 1481.00, 10, "AMD Ryzen 5"));
		produtos.add(new Produto(2, 258.81, 15, "Memoria RAM DDR4"));
		produtos.add(new Produto(3, 587.06, 7, "Placa M�e AM4"));
		produtos.add(new Produto(4, 234.12, 20, "Gabinete"));
		produtos.add(new Produto(5, 351.76, 30, "Fonte 500W"));
	}
	
	public Integer codigoUltimoProdutoCadastrado() {
		return produtos.get((produtos.size() - 1)).getId();
	}
	
	public List<Produto> todosProdutos(){
		return produtos;
	}
	
	public boolean checarProduto(Integer id) {
		for(Produto p: produtos) {
			if(p.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public void editarProduto(Produto produto) {
		for(Produto p: produtos) {
			if(p.getId() == produto.getId()) {
				p.setId(produto.getId());
				p.setNome(produto.getNome());
				p.setPreco(produto.getPreco());
				p.setQtdEstoque(produto.getQtdEstoque());
			}
		}
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public Produto pesquisarProduto(String nome) {
		for(Produto p: produtos) {
			if(p.getNome().toUpperCase().contains(nome.toUpperCase())) {
				return p;
			}
		}
		return new Produto();
	}
	
	public void removeProduto(Integer id) {
		int loop = 0;
		for(Produto p: produtos) {
			if(p.getId() == id) {
				produtos.remove(loop);
				break;
			}
			loop += 1;
		}
	}
}