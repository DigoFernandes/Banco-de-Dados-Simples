package br.com.rodrigo.senai.dev.caixa.domain;

public enum RoleEnum {
	
	GERENTE("Gerente"), TITULAR("Titular");
	private String nome;

	private RoleEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
