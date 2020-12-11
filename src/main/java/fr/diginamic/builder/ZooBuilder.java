package fr.diginamic.builder;

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
			
		for (Zone z : zoo.getZones()) {
			if(z.getNom().equals(zone)) {
				if(z.getCapacite()>z.getAnimal().size()) {
					z.getAnimal().add(animal);
				}else {
					throw new ZoneException("plus de place !");
				}
			}else {
				throw new ZoneException("zone introuvable");
			}
		}
		return this;
	}
	
	public Zoo get() {
		return zoo;
	}
	
}

