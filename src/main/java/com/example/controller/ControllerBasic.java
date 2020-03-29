package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repository.Empleado_Repo;
import com.example.repository.Tarea_repo;

@Controller
@RequestMapping()
public class ControllerBasic { 

	private final Empleado_Repo empl_repo;
	
	
	@Autowired
	public ControllerBasic(Empleado_Repo empl_repo) {
		this.empl_repo = empl_repo;
	}

	@GetMapping(path = {"/saludo"}) 
	public String saludo() {
		return "saludo";
	}
	
	@GetMapping(path = {"/index"}) 
	public String index(Model model) {
		model.addAttribute("empleados", empl_repo.findAll());
		return "index";
	}
	
/*	@GetMapping(path = {"/pagina"}) 
	public String index2(Model model) {
		model.addAttribute("empleados", tarea_repo.findAll());
		return "index";
	}*/
}
