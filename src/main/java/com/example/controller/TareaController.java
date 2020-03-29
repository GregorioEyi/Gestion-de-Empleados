package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Tarea;
import com.example.repository.Tarea_repo;

@RestController
public class TareaController {

	private final Tarea_repo tarea_repo;
	
	@Autowired
	public TareaController(Tarea_repo tarea_repo) {
		this.tarea_repo = tarea_repo;
	}
	
	@GetMapping(path = {"/tareas"})
	public List<Tarea> tareas() {
		return tarea_repo.findAll();
	}
	
}
