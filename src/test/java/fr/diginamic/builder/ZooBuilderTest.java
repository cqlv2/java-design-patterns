package fr.diginamic.builder;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ZooBuilderTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		ZooBuilder zb=new ZooBuilder("test");
		Zoo zooA=null;

		
		try {
			zooA=zb.appendZone("zoneA", 10).appendAnimal("zoneA", new Lion()).get();
		} catch (ZoneException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals("test", zooA.getNom());
		assertEquals(1, zooA.getZones().size());
		assertEquals(1, zooA.getZones().get(0).getAnimal().size());

	}
	
	@Test
	public void test2() {
		ZooBuilder zb=new ZooBuilder("test2");
		Zoo zooB=null;

		
		try {
			zooB=zb.appendZone("zoneB", 1).appendAnimal("zoneB", new Lion()).appendAnimal("zoneB", new Lion()).get();
		} catch (ZoneException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals("test", zooB.getNom());
		assertEquals(1, zooB.getZones().size());
		assertEquals(1, zooB.getZones().get(0).getAnimal().size());

	}

}
