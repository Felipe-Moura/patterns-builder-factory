package com.montadora.carro;

public class CarroDirector {
	
	private CarroBuilder carroBuilder;
	
	public CarroDirector(CarroBuilder carroBuilder) {
		this.carroBuilder = carroBuilder;
	}
	
	public Carro getCarro() {
		return this.carroBuilder.getCarro();
	}
	
	public void fabricaCarro() {
		this.carroBuilder.montaPneu();
		this.carroBuilder.montaMotor();
		this.carroBuilder.montaChassi();
		this.carroBuilder.defineTipo();
	}

}
