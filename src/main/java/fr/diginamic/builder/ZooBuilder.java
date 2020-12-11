package fr.diginamic.builder;

import java.util.Optional;

public class ZooBuilder {

	private Zoo zoo;
	//construct
	ZooBuilder(String nom){
		zoo=new Zoo(nom);
	}
	//appendZone
	public ZooBuilder appendZone(String zone, int capacite) {
		zoo.getZones().add(new Zone(zone, capacite));
		return this;
	}
	//appendAnimal
	public ZooBuilder appendAnimal(String zone, Animal animal) throws ZoneException {
		Optional<Zone> aze = zoo.getZones().stream().filter(z->z.getNom().equals(zone)).findFirst();
		if(aze.isPresent()) {
			if(aze.get().getCapacite()>aze.get().getAnimal().size()) {
				aze.get().getAnimal().add(animal);
			}else {
				throw new ZoneException("plus de place !");
			}
		}else {
			throw new ZoneException("zone introuvable");
		}

		return this;
	}
	
	public Zoo get() {
		return zoo;
	}
	
}

