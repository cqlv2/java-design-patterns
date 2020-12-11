package fr.diginamic.singleton2;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ConfigSingletonTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		ConfigSingleton conf=ConfigSingleton.getConfig();
		assertEquals("1234", conf.getPass());

	}

}
