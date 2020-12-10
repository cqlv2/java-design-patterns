package fr.diginamic.factory.entity;

import fr.diginamic.factory.ObjetConnecte;
import fr.diginamic.factory.enums.EnumObjetConnecte;

public class Smartphone extends ObjetConnecte {
	
	public Smartphone(int limiteVolts) {
		this.limiteVolts=limiteVolts;
	}

	@Override
	public String toString() {
		return "c'est un Smartphone avec "+this.limiteVolts+" de limiteVolts";
	}

	
	
}
