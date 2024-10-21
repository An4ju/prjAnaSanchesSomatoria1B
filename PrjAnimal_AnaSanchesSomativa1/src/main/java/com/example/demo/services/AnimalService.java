package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Animal;
import com.example.demo.repositories.AnimalRepository;

@Service
public class AnimalService {
	
	private final AnimalRepository animalrepository;
	
	@Autowired
	public AnimalService(AnimalRepository animalrepository) {
		this.animalrepository = animalrepository;
	}

	//criação do animal
	public Animal saveAnimal(Animal animal) {
		return animalrepository.save(animal);
	}
	//buscar animal 
	public Animal getAnimalById(Long id) {
		return animalrepository.findById(id).orElse(null);
	}
	//procurar todos os animais
	public List<Animal> getAllAnimal(){
		return animalrepository.findAll();
	}
	
	//excluir os animal
	public void deleteAnimal(Long id) {
		animalrepository.deleteById(id);
	}
}
