package com.montadora.pecas.factory;

import com.montadora.pecas.pneu.Pneu;
import com.montadora.pecas.pneu.PneuComum;
import com.montadora.pecas.pneu.PneuEsportivo;
import com.montadora.pecas.pneu.PneuOffRoad;

public class PneuFactory {
	
	public Pneu criaPneu(int modeloPneu) {
		
		Pneu novoPneu = null;
		
		if(modeloPneu == 1) {
			novoPneu = new PneuComum();
		}
		else if(modeloPneu == 2) {
			novoPneu = new PneuEsportivo();
		}
		else if(modeloPneu == 3) {
			novoPneu = new PneuOffRoad();
		}
		
		return novoPneu;
		
	}

}
