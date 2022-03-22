package com.montadora.pecas.motor;

import com.montadora.pecas.Pecas;

public abstract class Motor extends Pecas{
	
	private double cavalos;
	
	public Motor() {
		setTipo("Motor");
	}

	public double getCavalos() {
		return cavalos;
	}

	public void setCavalos(double cavalos) {
		this.cavalos = cavalos;
	}
	
	@Override
	public String toString() {
		return super.toString() + " cavalos(" + cavalos + ")";
	}

}
