package mz.co.dipeshcr.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mz.co.dipeshcr.modelo.NumeroRomano;

@Controller
public class NumerosController {

	@RequestMapping("/numerosromanos")
	public String mostraPaginaInicial() {
		System.out.println("Executando a logica com o Spring MVC");
		return "index";
	}

	@RequestMapping("/converterNumerosRomanos")
	public String converterNumeroRomano(NumeroRomano numeroRomano, HttpSession session) {
		System.out.println("Executando a logica com o Spring MVC");
		int numero = numeroRomano.getNumeroNatural(numeroRomano.getNumeroRomano());
		session.setAttribute("numeroRomano", numeroRomano);
		session.setAttribute("numero", numero);
		return "resultadofinal";
	}

}
