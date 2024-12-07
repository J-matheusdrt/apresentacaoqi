package DTO;

public class Garcom {

	private String nome;
	private long id;
	private double salario;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String statusPedido() {
		return null;
	}
	public void chamarLimpeza() {
		
	}
	public void receberPagamento () {
		
	}
}
