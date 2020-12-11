package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	private List<Zone> zones;

	Zoo(String nom) {
		this.nom = nom;
		this.zones=new ArrayList<Zone>();
	
	
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}



}
