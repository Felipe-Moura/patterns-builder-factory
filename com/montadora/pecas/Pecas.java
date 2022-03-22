package com.montadora.pecas;

public abstract class Pecas {

	private String tipo;
	private String modelo;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "modelo(" + modelo + ")";
	}
	
}
