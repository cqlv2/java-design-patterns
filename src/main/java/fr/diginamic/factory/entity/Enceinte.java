package fr.diginamic.factory.entity;

import fr.diginamic.factory.ObjetConnecte;

public class Enceinte extends ObjetConnecte {

	
	
	public Enceinte(int limiteVolts) {
		this.limiteVolts=limiteVolts;
	}

	@Override
	public String toString() {
		return "c'est une Enceinte avec "+this.limiteVolts+" de limiteVolts";
	}
}
