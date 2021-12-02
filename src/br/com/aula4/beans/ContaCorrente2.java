package br.com.aula4.beans;

public class ContaCorrente2 {

	private int agencia;
	private int conta;
	private double saldo;
	private Cliente cliente;
	private Banco banco;
	
	// Construtor
	
	public ContaCorrente2() {}

	public ContaCorrente2(int agencia, int conta, double saldo, Cliente cliente) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	public ContaCorrente2(int agencia, int conta, double saldo, Cliente cliente, Banco banco) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.cliente = cliente;
		this.banco = banco;
	}



	// Getters e Setters
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	
	}

	
}
