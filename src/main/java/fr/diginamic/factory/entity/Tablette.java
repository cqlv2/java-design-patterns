package fr.diginamic.factory.entity;

import fr.diginamic.factory.ObjetConnecte;

public class Tablette extends ObjetConnecte {
	
	
	
	
	public Tablette(int limiteVolts) {
		this.limiteVolts=limiteVolts;
	}

	@Override
	public String toString() {
		return "c'est une tablette avec "+this.limiteVolts+" de limiteVolts";
	}

}
