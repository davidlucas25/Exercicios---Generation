package com.helloworld.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {
	
	@GetMapping
	public String hello() {
		return "Hello Generation!!!";
	}
	
	@GetMapping("/bsm")
	public String BSM() {
		return "Lista de BSM's da Generation: \n-Proatividade; \n-Trabalho em equipe; \n-Orientação aos detalhes;"
				+ "\n-Mentalidade de Crescimento; \n-Persistência; \n-Orientação ao futuro; \n-Responsabilidade Pessoal;"
				+ "\n-Comunicação";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Obter mais conhecimentos sobre API Rest, suas camadas e os seus métodos.";
	}
}
