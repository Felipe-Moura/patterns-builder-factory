package com.montadora.pecas.factory;

import com.montadora.pecas.motor.Motor;
import com.montadora.pecas.motor.MotorComum;
import com.montadora.pecas.motor.MotorEsportivo;
import com.montadora.pecas.motor.MotorOffRoad;

public class MotorFactory {
	
	public Motor criaMotor(int modeloMotor) {
		
		Motor novoMotor = null;
		
		if(modeloMotor == 1) {
			novoMotor = new MotorComum();
		}
		else if(modeloMotor == 2) {
			novoMotor = new MotorEsportivo();
		}
		else if(modeloMotor == 3) {
			novoMotor = new MotorOffRoad();
		}
		
		return novoMotor;
		
	}

}
