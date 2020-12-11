package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.Ielement;

public class Employe implements Ielement {

	private String poste;
	private String nom;
	private String prenom;
	private double salaire;

	public Employe(String poste, String nom, String prenom, double salaire) {
		super();
		this.poste = poste;
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	@Override
	public double calculerSalaire() {
		return this.salaire;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Employe [poste=" + poste + ", nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}

}
