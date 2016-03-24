package coo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EntrainementTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testIndNouvelEtage(){
		Porte porte = new Porte(EEtatOuverture.FERME, 2);
		GestionnaireServices gestserv = new GestionnaireServices();
		Etage etage = new Etage(2, gestserv, porte);
		Entrainement entrain = new Entrainement(EEtatDeplacement.ARRETE, 1);
		Cabine cabine = new Cabine(etage, porte, entrain, 200, gestserv);
		
		Etage etageTest = new Etage(2, gestserv, porte);
		entrain.indNouvelEtage(etageTest);
		assertEquals(cabine.getEtage(),etageTest);
	 }
	


}
