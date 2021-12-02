package br.com.aula4.beans;

public class Banco {

	// Atributos
	private String razao;
	private int idBancario;

	public Banco() {
	}

	public Banco(String grazao, int idBancario) {
		this.razao = razao;
		this.idBancario = idBancario;

	}

	// Getters e Setters

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public int getIdNumero() {
		return idBancario;
	}

	public void setIdNumero(int idBancario) {
		this.idBancario = idBancario;
	}

}
