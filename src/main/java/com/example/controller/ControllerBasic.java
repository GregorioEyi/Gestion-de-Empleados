package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class ControllerBasic { 

	@GetMapping(path = {"/index"}) 
	public String saludo() {
		return "saludo";
	}
	
	@GetMapping(path = {"/pagina"}) 
	public String saludo2() {
		return "index";
	}
}
