package fr.diginamic.composite;

import fr.diginamic.Ielement;

public class TestComposite {

	public static void main(String[] args) {

		Service dsin=new Service("dsin");
		Service bd =new Service("BigData");
		Service jd = new Service("JavaDev");
		dsin.getiElements().add(new Service("BigData"));
		dsin.getiElements().add(new Service("JavaDev"));
		
		
		
		
		dsin.getiElements().add(new Employe("Directeur", "raspey", "Cecile", 10000));
		dsin.getiElements().add(new Employe("Architecte", "BECHKAR", "Bilel", 8000));
		
		bd.getiElements().add(new Employe("chef de service", "RANMEY", "jb", 7500));
		bd.getiElements().add(new Employe("concepteur", "DOE", "Janne", 3500));
		jd.getiElements().add(new Employe("chef de service", "john", "AZERTY", 7500));
		jd.getiElements().add(new Employe("lead dev", "QWERTYT", "bob", 3500));
		
		
		
		System.out.println(dsin.getNom());
		
		
		
	}

}
