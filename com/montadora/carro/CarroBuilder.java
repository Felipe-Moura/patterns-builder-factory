package com.montadora.carro;

public interface CarroBuilder {
	
	public void defineTipo();
	
	public void montaPneu();
	
	public void montaMotor();
	
	public void montaChassi();
	
	public Carro getCarro();

}
