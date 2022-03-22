package com.montadora.pecas.factory;

import com.montadora.pecas.chassi.Chassi;
import com.montadora.pecas.chassi.ChassiComum;
import com.montadora.pecas.chassi.ChassiEsportivo;
import com.montadora.pecas.chassi.ChassiOffRoad;

public class ChassiFactory {
	
	public Chassi criaChassi(int modeloChassi) {
		
		Chassi novoChassi = null;
		
		if(modeloChassi == 1) {
			novoChassi = new ChassiComum();
		}
		else if(modeloChassi == 2) {
			novoChassi = new ChassiEsportivo();
		}
		else if(modeloChassi == 3) {
			novoChassi = new ChassiOffRoad();
		}
		
		return novoChassi;
		
	}

}
