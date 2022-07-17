package com.comunicacaoserialarduino.ComunicacaoSerialArduino.controller;

public class Arduino {
	private ControlePorta arduino;

	public Arduino() {
		arduino = new ControlePorta("COM3", 9600);
	}

	public void comunicacaoArduino(String comando) {
		
		// Comando com porta 13
		if ("Ligar".equals(comando)) {
			arduino.enviaDados(1);
			System.out.println("Ligada Porta 13");// Imprime o nome do botão pressionado
		} else if ("Desligar".equals(comando)) {
			arduino.enviaDados(2);
			System.out.println("Desligada Porta 13");

			// Comando com porta 12
		} else if ("Ligar12".equals(comando)) {
			arduino.enviaDados(3);
			System.out.println("Ligada Porta 12");
		} else if ("Desligar12".equals(comando)) {
			arduino.enviaDados(4);
			System.out.println("Desligada Porta 12");

			// Comando com porta 11
		} else if ("Ligar11".equals(comando)) {
			arduino.enviaDados(5);
			System.out.println("Ligada Porta 11");
		} else if ("Desligar11".equals(comando)) {
			arduino.enviaDados(6);
			System.out.println("Desligada Porta 11");

		} else {
			arduino.close();
			System.out.println("Sair");// Imprime o nome do botão pressionado
		}
	}
}