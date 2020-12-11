package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.Ielement;

public class Service implements Ielement {

	private String nom;
	private List<Ielement> iElements = new ArrayList<Ielement>();

	public Service(String nom) {
		super();
		this.nom = nom;
	}


	@Override
	public double calculerSalaire() {
		return 0;
		// calcule et retourne le salaire de tous les employés associés au service et
		// sous-services associés.
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Ielement> getiElements() {
		return iElements;
	}

	public void setiElements(List<Ielement> iElements) {
		this.iElements = iElements;
	}
	
	
}
