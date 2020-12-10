package fr.diginamic.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.factory.enums.EnumObjetConnecte;

public class ObjCoFactTest {



	@Test
	public void test() {
		
		ObjCoFact oc=new ObjCoFact();
		ObjetConnecte phone= oc.getObjet(EnumObjetConnecte.TELEPHONE, 1000);
		assertEquals("c'est un Smartphone avec 1000 de limiteVolts", phone.toString());
	}

}


