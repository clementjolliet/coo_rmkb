package coo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoutonTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void indPressionTest() {
		GestionnaireServices gestSrvc = new GestionnaireServices();
		Etage etage = new Etage(1, gestSrvc);
		Bouton btn = new Bouton(etage, 1);
	}

}
