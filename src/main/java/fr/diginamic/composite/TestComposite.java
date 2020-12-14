package fr.diginamic.composite;

import fr.diginamic.Ielement;

public class TestComposite {

	public static void main(String[] args) {

		Service dsin=new Service("dsin");
		Service bd =new Service("BigData");
		Service jd = new Service("JavaDev");
		dsin.getiElements().add(bd);
		dsin.getiElements().add(jd);
		dsin.getiElements().add(new Employe("Directeur", "raspey", "Cecile", 10000));
		dsin.getiElements().add(new Employe("Architecte", "BECHKAR", "Bilel", 8000));	
		bd.getiElements().add(new Employe("chef de service", "RANMEY", "jb", 7500));
		bd.getiElements().add(new Employe("concepteur", "DOE", "Janne", 3500));
		jd.getiElements().add(new Employe("chef de service", "john", "AZERTY", 7500));
		jd.getiElements().add(new Employe("lead dev", "QWERTYT", "bob", 3500));

		
		Service s1 =new Service("serv1");
		s1.getiElements().add(new Employe("lead dev", "aze", "bob", 1000));
		s1.getiElements().add(new Employe("lead dev", "qsd", "bob", 2000));
		s1.getiElements().add(new Employe("lead dev", "wxc", "bob", 3000));
		
		Service s2 =new Service("serv2");
		s2.getiElements().add(new Employe("lead dev", "aze", "bob", 4000));
		s2.getiElements().add(new Employe("lead dev", "qsd", "bob", 2500));
		s2.getiElements().add(new Employe("lead dev", "wxc", "bob", 3500));
		Service s3 =new Service("serv3");
		s3.getiElements().add(new Employe("lead dev", "aze", "bob", 1600));
		s3.getiElements().add(new Employe("lead dev", "qsd", "bob", 2700));
		s3.getiElements().add(new Employe("lead dev", "wxc", "bob", 3800));
		Service s4 =new Service("serv4");
		s4.getiElements().add(new Employe("lead dev", "aze", "bob", 1010));
		s4.getiElements().add(new Employe("lead dev", "qsd", "bob", 2020));
		s4.getiElements().add(new Employe("lead dev", "wxc", "bob", 3030));
		Service s5 =new Service("serv5");
		s5.getiElements().add(new Employe("lead dev", "aze", "bob", 1040));
		s5.getiElements().add(new Employe("lead dev", "qsd", "bob", 2050));
		s5.getiElements().add(new Employe("lead dev", "wxc", "bob", 3060));
		Service s6 =new Service("serv6");
		s6.getiElements().add(new Employe("lead dev", "aze", "bob", 1045));
		s6.getiElements().add(new Employe("lead dev", "qsd", "bob", 2010));
		s6.getiElements().add(new Employe("lead dev", "wxc", "bob", 3000));
		
		jd.getiElements().add(new Employe("lead dev", "QWERTYT", "bob", 3500));
		
		
		jd.getiElements().add(s1);
		jd.getiElements().add(s2);
		s2.getiElements().add(s3);
		bd.getiElements().add(s4);
		s4.getiElements().add(s5);
		s5.getiElements().add(s6);
		
		
		recurse(dsin, 0);
	}

	public static void recurse(Service serv, int pos) {
		String prefix="";
		for (int i = 0; i < pos; i++) {
			prefix+="|"+(char) 9;
		}
		System.out.println(prefix+serv.getNom()+"(total frais : "+serv.calculerSalaire()+")");
		
		for (Ielement elm :serv.getiElements()) {
			
			if(elm.getClass().equals(Employe.class)) {
				System.out.println(prefix+"|__"+elm.toString());
			}else {
				recurse((Service)elm, pos+1);
			}
		}
	}
	
	
}
