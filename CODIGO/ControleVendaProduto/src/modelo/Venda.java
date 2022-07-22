package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {

	private Integer id;
	private Date dataVenda;
	private Double valorVenda;
	private Vendedor vendedor;
	private Cliente cliente;
	
	private List<Pedido> carrinho = new ArrayList<Pedido>();
	
	public Venda() {
		
	}

	public Venda(Integer id, Date dataVenda, Double valorVenda, Vendedor vendedor, Cliente cliente) {
		this.id = id;
		this.dataVenda = dataVenda;
		this.valorVenda = valorVenda;
		this.vendedor = vendedor;
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void adicionarAoCarrinho(Pedido pedido) {
		carrinho.add(pedido);
	}
	
	public void totalVenda() {
		// TODO
	}
	
	
}
