package coo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PorteTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Porte porte = new Porte(EEtatOuverture.FERME, 3);
		
		porte.ouvrir();
		assertEquals(porte.getEtatOuverture(), EEtatOuverture.OUVERT);
	}

}
