package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "<b>Hello Turma 62!</b>";
	}
	
	@GetMapping("/nome")
	public String meuNome() {
		return "<b>Hello!<br />Ketelyn Medina</b>";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<b>Responsabilidade Pessoal<br />"
				+"Mentalidade de Crescimento<br />"
				+"Comunicação<br />"
				+"Proatividade<br />"
				+"Trabalho em Equipe<br />"
				+"Persistência<br />"
				+"Orientação ao Futuro<br />"
				+"Orientação os Detalhes<br />";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "<b>Objetivos<br />"
				+"- Estudar mais Spring<br />"
				+"- Praticar programação mais vezes<br />"
				+"- Estudar Inglês para facilitar meu aprendizado<br />";
	}
	
}
