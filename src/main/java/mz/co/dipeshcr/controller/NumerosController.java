package mz.co.dipeshcr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NumerosController {

	@RequestMapping("/numerosromanos")
	public String mostraPaginaInicial() {
		System.out.println("Executando a logica com o Spring MVC");
		return "index";
	}

}
