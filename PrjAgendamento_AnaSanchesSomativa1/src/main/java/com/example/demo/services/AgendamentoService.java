package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Agendamento;
import com.example.demo.repositories.AgendamentoRepository;

@Service
public class AgendamentoService {
	
	private final AgendamentoRepository agendamentorepository;
	
	@Autowired
	public AgendamentoService(AgendamentoRepository agendamentorepository) {
		this.agendamentorepository = agendamentorepository;
	}

	//criação do agendamento
	public Agendamento saveAgendamento(Agendamento agendamento) {
		return agendamentorepository.save(agendamento);
	}
	//buscar agendamento 
	public Agendamento getAgendamentoById(Long id) {
		return agendamentorepository.findById(id).orElse(null);
	}
	//procurar todos os agendamentos
	public List<Agendamento> getAllAgendamento(){
		return agendamentorepository.findAll();
	}
	
	//excluir os agendamentos
	public void deleteAgendamento(Long id) {
		agendamentorepository.deleteById(id);
	}
}
