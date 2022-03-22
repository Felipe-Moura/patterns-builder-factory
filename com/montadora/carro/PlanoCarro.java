package com.montadora.carro;

import com.montadora.pecas.chassi.Chassi;
import com.montadora.pecas.motor.Motor;
import com.montadora.pecas.pneu.Pneu;

public interface PlanoCarro {
	
	public void setPneu(Pneu modeloPneu);
	
	public void setMotor(Motor modeloMotor);
	
	public void setChassi(Chassi modeloChassi);

}
