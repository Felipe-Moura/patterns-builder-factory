package com.montadora.pecas.chassi;

import com.montadora.pecas.Pecas;

public class Chassi extends Pecas{

	private String cor;
	
	public Chassi() {
		setTipo("Chassi");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return super.toString() + " cor(" + cor + ")";
	}
	
}
