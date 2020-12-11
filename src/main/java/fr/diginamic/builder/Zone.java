package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Zone {
	private String nom;
	private Integer capacite;
	private List<Animal> animal;
	
	public Zone(String nom, Integer capacite) {
		this.nom = nom;
		this.capacite = capacite;
		this.animal = new ArrayList<Animal>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getCapacite() {
		return capacite;
	}

	public void setCapacite(Integer capacite) {
		this.capacite = capacite;
	}

	public List<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}
	
	
}
