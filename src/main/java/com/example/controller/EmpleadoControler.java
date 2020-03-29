package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Empleado;
import com.example.entities.Tarea;
import com.example.repository.Empleado_Repo;
import com.example.repository.Tarea_repo;

@RestController  // =@Service
public class EmpleadoControler {

	private final Empleado_Repo empl_repo; // instancio la interfaz empleado
	
	
	@Autowired
	public EmpleadoControler(Empleado_Repo empl_repo) {
		this.empl_repo = empl_repo;
	}
	
	@GetMapping(path = "/empleados")
	public List<Empleado> empleados() {
		return empl_repo.findAll();
	}
	
}
