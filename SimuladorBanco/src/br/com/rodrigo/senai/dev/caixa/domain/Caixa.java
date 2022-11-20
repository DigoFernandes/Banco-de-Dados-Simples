package br.com.rodrigo.senai.dev.caixa.domain;

public class Caixa {		

	int doisReais, dezReais, vinteReais, cinquentaReais;

	public int getDoisReais() {
		return doisReais;
	}

	public void setDoisReais(int doisReais) {
		this.doisReais = doisReais;
	}

	public int getDezReais() {
		return dezReais;
	}

	public void setDezReais(int dezReais) {
		this.dezReais = dezReais;
	}

	public int getVinteReais() {
		return vinteReais;
	}

	public void setVinteReais(int vinteReais) {
		this.vinteReais = vinteReais;
	}

	public int getCinquentaReais() {
		return cinquentaReais;
	}

	public void setCinquentaReais(int cinquentaReais) {
		this.cinquentaReais = cinquentaReais;
	}
	

	@Override
	public String toString() {
		return "Caixa [doisReais=" + doisReais + ", dezReais=" + dezReais + ", vinteReais=" + vinteReais
				+ ", cinquentaReais=" + cinquentaReais + "]";
	}
	
}
