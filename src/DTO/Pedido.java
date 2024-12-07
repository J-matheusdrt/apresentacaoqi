package DTO;

public class Pedido {

	private String nomeCliente;
	private byte numeroMesa;
	private String statusPedido;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public byte getNumeroMesa() {
		return numeroMesa;
	}
	public void setNumeroMesa(byte numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	public String getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}
	
	public void visualizarCardapio() {
		
	}
	
	public String criarComanda() {
		return null;
	}
	public String criarPedido() {
		return null;
	}
	
	public String editarPedido() {
		return null;
	}
	
	public  void consultarPedido(){
		
	}
	
	public Boolean enviarPedido() {
		return true;
	}
	
	public Boolean finaizarComanda() {
		return true;
	}
	
}
