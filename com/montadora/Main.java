package com.montadora;

import java.util.Scanner;

import com.montadora.carro.Carro;
import com.montadora.carro.CarroBuilder;
import com.montadora.carro.CarroDirector;
import com.montadora.carro.MontaCarroComum;
import com.montadora.carro.MontaCarroEsportivo;
import com.montadora.carro.MontaCarroOffRoad;

public class Main {
	
	public static void main(String args[]) {
		
		CarroBuilder carroBuilder = null;
		CarroDirector carroDirector = null;
		Carro novoCarro = null;
		Scanner entrada = new Scanner(System.in);
		int escolha;
		
		System.out.println("Montadora de carros:\n");
		System.out.println("Escolha o modelo a ser criado:");
		System.out.println(" - Carro Comum (1)");
		System.out.println(" - Carro Esportivo (2)");
		System.out.println(" - Carro Offroad (3)");
		System.out.print("\nModelo: ");
		
		escolha = entrada.nextInt();
		
		if(escolha == 1) {
			carroBuilder = new MontaCarroComum();
		}
		else if(escolha == 2) {
			carroBuilder = new MontaCarroEsportivo();
		}
		else if(escolha == 3) {
			carroBuilder = new MontaCarroOffRoad();
		}
		
		carroDirector = new CarroDirector(carroBuilder);
		
		carroDirector.fabricaCarro();
		
		novoCarro = carroDirector.getCarro();
		
		System.out.println("\nNovo Carro Contruido: ");
		System.out.println(novoCarro);
		
	}

}
