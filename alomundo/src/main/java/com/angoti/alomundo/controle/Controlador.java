package com.angoti.alomundo.controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

	@RequestMapping("/abc")
	public String controle1() {
		System.out.println("---------------------> 1");
		return "teste";
	}
	
	@RequestMapping("/alo")
	public String controle2() {
		return "home";
	}

	@RequestMapping("/nro")
	public String controle3(Model modelo) {
		modelo.addAttribute("x", 1);
		return "exibenro";
	}

	@RequestMapping("/sorteio")
	public String controle4(Model modelo) {
		int[] numeros = new int[6];
		for(int x=0; x<6;x++)
			numeros[x] = (int)(Math.random()*60)+1;
		modelo.addAttribute("nro", numeros);
		return "ex1";
	}
	
	
}
