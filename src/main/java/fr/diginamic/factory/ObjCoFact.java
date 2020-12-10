package fr.diginamic.factory;

import fr.diginamic.factory.entity.Enceinte;
import fr.diginamic.factory.entity.Smartphone;
import fr.diginamic.factory.entity.Tablette;
import fr.diginamic.factory.enums.EnumObjetConnecte;








public class ObjCoFact extends ObjetConnecte {
	
	public ObjetConnecte getObjet(EnumObjetConnecte type,int limiteVolts) {
		switch (type) {
		case TELEPHONE:
			return new Smartphone(limiteVolts);
		case TABLETTE:
			return new Tablette(limiteVolts);
		case ENCEINTE:
			return new Enceinte(limiteVolts);

		default:
			return null;
		}
		
	}
	
}
