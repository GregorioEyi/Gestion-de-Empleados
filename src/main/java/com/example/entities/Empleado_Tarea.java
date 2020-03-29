package com.example.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



public class Empleado_Tarea{
	

	private int id_Empleado;
	

	private int id_Tarea;
	
	public Empleado_Tarea() {

	}
	
	public Empleado_Tarea(int id_Empleado, int id_Tarea) {
		super();
		this.id_Empleado = id_Empleado;
		this.id_Tarea = id_Tarea;
	}

	public int getId_Empleado() {
		return id_Empleado;
	}

	public void setId_Empleado(int id_Empleado) {
		this.id_Empleado = id_Empleado;
	}

	public int getId_Tarea() {
		return id_Tarea;
	}

	public void setId_Tarea(int id_Tarea) {
		this.id_Tarea = id_Tarea;
	}

}
