package mz.co.dipeshcr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {
	
	@RequestMapping("/olaMundoSpring")
	public String execute(){
		System.out.println("Executando a logica com o Spring MVC");
		return "ola";
	}
}
