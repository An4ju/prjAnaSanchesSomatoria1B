package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // é uma entidade
@Table(name = "agendamento")//nomea a tabela
public class Agendamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int data;
	private int horario;
	private String local;

	///////ID///////////
	public Long getId() {
	return id;
	}
		
	public void setId(Long id) {
	this.id = id;
	}
	
	////////Data///////
	public int getData() {
	return data;
	}
			
	public void setData(int data) {
	this.data = data;
	}
	
	
    ///////Horario//////////////////
	public int getHorario() {
	return horario;
	}
					
	public void setHorario(int horario) {
	this.horario = horario;
	}
	
    ///////Local//////////////////
	public String getLocal() {
	return local;
	}
					
	public void setLocal(String local) {
	this.local = local;
	}
	
}

