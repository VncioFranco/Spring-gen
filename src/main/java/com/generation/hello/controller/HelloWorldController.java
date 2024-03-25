package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
	
	@GetMapping()  // Requisições do tipo GET / Busca
	public String hello() {
		return "Hello World <br> Trabalho Em Equipe <br> Comunicação <br> Orientação ao Futuro <br> "
				+ "Responsabilidade pessoal<br> Mentalidade de Crescimento <br> Persistência <br>"
				+ " Orientação ao detalhe <br> Proatividade <br>";
		
	}

}
