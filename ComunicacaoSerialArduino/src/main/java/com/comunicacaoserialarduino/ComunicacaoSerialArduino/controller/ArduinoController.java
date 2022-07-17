package com.comunicacaoserialarduino.ComunicacaoSerialArduino.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArduinoController {
	Arduino arduino = new Arduino();
	Informacao informacao = new Informacao();

	@Autowired
	private InformacaoRepository informacaoRepository;
	// GET PARA A PÁGINA DE CONTROLE
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	//GET PARA A PÁGINA INICIAL
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	// GET PARA RELATORIO DO BD
		@GetMapping("/relatorio")
		public String relatorio(Model model) {				
		        List<Informacao> textoKB = (List<Informacao>) informacaoRepository.findAll();
		        model.addAttribute("listaInformacao", textoKB);	        
		        return "relatorio";
		    }
	
	// GET PARA LIGAR A PORTA 13 DO ARDUINO E INFORMAR NO BD
	@GetMapping("/ligar13")
	public String ligarArduino() {
		arduino.comunicacaoArduino("Ligar");		
		informacao.setEquipamento("Ar-Condicionado");
		informacao.setValorinfo("Ligado");
		informacaoRepository.save(informacao);
		return "home";

	}
	// GET PARA DESLIGAR A PORTA 13 DO ARDUINO E INFORMAR NO BD
	@GetMapping("/desligar13")
	public String desligarArduino() {
		arduino.comunicacaoArduino("Desligar");
		informacao.setEquipamento("Ar-Condicionado");
		informacao.setValorinfo("Desligado");
		informacaoRepository.save(informacao);
		return "home";
	}
	// GET PARA LIGAR A PORTA 12 DO ARDUINO E INFORMAR NO BD
	@GetMapping("/ligar12")
	public String ligar12Arduino() {
		arduino.comunicacaoArduino("Ligar12");
		informacao.setEquipamento("Lampada");
		informacao.setValorinfo("Ligado");
		informacaoRepository.save(informacao);
		return "home";

	}
	// GET PARA DESLIGAR A PORTA 12 DO ARDUINO E INFORMAR NO BD
	@GetMapping("/desligar12")
	public String desliga12Arduino() {
		arduino.comunicacaoArduino("Desligar12");
		informacao.setEquipamento("Lampada");
		informacao.setValorinfo("Desligado");
		informacaoRepository.save(informacao);
		return "home";

	}
	// GET PARA LIGAR A PORTA 11 DO ARDUINO E INFORMAR NO BD
	@GetMapping("/ligar11")
	public String ligar11Arduino() {
		arduino.comunicacaoArduino("Ligar11");
		informacao.setEquipamento("TV");
		informacao.setValorinfo("Ligado");
		informacaoRepository.save(informacao);
		return "home";

	}
	// GET PARA DESLIGAR A PORTA 11 DO ARDUINO E INFORMAR NO BD
	@GetMapping("/desligar11")
	public String desligar11Arduino() {
		arduino.comunicacaoArduino("Desligar11");
		informacao.setEquipamento("TV");
		informacao.setValorinfo("Desligado");
		informacaoRepository.save(informacao);
		return "home";
	}	
	
}