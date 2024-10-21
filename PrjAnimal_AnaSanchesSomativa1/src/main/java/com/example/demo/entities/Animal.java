package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // é uma entidade
@Table(name = "animal")//nomea a tabela
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String raca;
	private String cor;
	private int idade;

	///////ID///////////
	public Long getId() {
	return id;
	}
		
	public void setId(Long id) {
	this.id = id;
	}
	
	////////Nome///////
	public String getNome() {
	return nome;
	}
			
	public void setNome(String nome) {
	this.nome = nome;
	}
	
	
	/////////Raça///////
	public String getRaca() {
	return raca;
	}
				
	public void setRaca(String raca) {
	this.raca = raca;
	}
	
	///////Cor//////////////////
	public String getCor() {
	return cor;
	}
					
	public void setCor(String cor) {
	this.cor = cor;
	}
	
    ///////Idade//////////////////
	public int getIdade() {
	return idade;
	}
					
	public void setIdade(int idade) {
	this.idade = idade;
	}
	
}

