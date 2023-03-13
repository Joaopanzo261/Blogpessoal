package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Indica para o spring que essa é uma classe controladora;
@RestController

// Indica um endpoint para a nossa aplicação.
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		
		return "Hello World... How are you today? ";
	}
	
	
	@GetMapping ("bsm")
	public String bsm() {
		
		return "Atenção aos Detalhes"+ "- Trabalho em Equipe\r\n"
	     		+ "- Orientação ao Futuro\r\n"
	     		+ "- Proatividade\r\n"
	     		+ "- Mentalidade de crescimento\r\n"
	     		+ "- Comunicação\r\n"
	     		+ "- Comunicação Não Violenta\r\n"
	     		+ "- Responsabilidade Pessoal";
	}
	
	
	@GetMapping ("objetivos")
	public String objetivos() {
		
		return "Trabalhar por cima de orientação ao detalhe"+ "- Comunicação eficiente\r\n"
	     		+ "- Fazer gestão de tempo\r\n"
	     		+ "- Responsabilidade Pessoal por cima das demandas\r\n"
	     		+ "- Mentalidade de crescimento\r\n";
	}		
	

}
