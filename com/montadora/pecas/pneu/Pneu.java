package com.montadora.pecas.pneu;

import com.montadora.pecas.Pecas;

public class Pneu extends Pecas{

	private double raio;
	
	public Pneu() {
		setTipo("Pneu");
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public String toString() {
		return super.toString() + " raio(" + raio + ")";
	}
	
}
