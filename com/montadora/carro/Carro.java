package com.montadora.carro;

import com.montadora.pecas.chassi.Chassi;
import com.montadora.pecas.motor.Motor;
import com.montadora.pecas.pneu.Pneu;

public class Carro implements PlanoCarro{

	private String tipo;
	private Pneu pneu;
	private Motor motor;
	private Chassi chassi;
	
	@Override
	public void setPneu(Pneu modeloPneu) {
		
		this.pneu = modeloPneu;
		
	}
	
	public Pneu getPneu() {return pneu;}

	@Override
	public void setMotor(Motor modeloMotor) {
		
		this.motor = modeloMotor;
		
	}
	
	public Motor getMotor() {return motor;}

	@Override
	public void setChassi(Chassi modeloChassi) {
		
		this.chassi = modeloChassi;
		
	}
	
	public Chassi getChassi() {return chassi;}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {return tipo;}

	@Override
	public String toString() {
		return  tipo + "\npneu = " + pneu + "\nmotor = " + motor + "\nchassi = " + chassi;
	}
	
	

}
