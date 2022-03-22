package com.montadora.carro;

import com.montadora.pecas.factory.ChassiFactory;
import com.montadora.pecas.factory.MotorFactory;
import com.montadora.pecas.factory.PneuFactory;

public class MontaCarroComum implements CarroBuilder{

	private Carro carro;
	
	PneuFactory fabricaPneu = new PneuFactory();
	MotorFactory fabricaMotor = new MotorFactory();
	ChassiFactory fabricaChassi = new ChassiFactory();
	
	public MontaCarroComum() {
		this.carro = new Carro();
	}
	
	@Override
	public void montaPneu() {
		this.carro.setPneu(fabricaPneu.criaPneu(1));
	}

	@Override
	public void montaMotor() {
		this.carro.setMotor(fabricaMotor.criaMotor(1));
	}

	@Override
	public void montaChassi() {
		this.carro.setChassi(fabricaChassi.criaChassi(1));
	}

	@Override
	public Carro getCarro() {
		return this.carro;
	}

	@Override
	public void defineTipo() {
		this.carro.setTipo("Carro Comum");
		
	}

}
