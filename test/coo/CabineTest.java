package coo;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import coo.*;

public class CabineTest {
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetEtatCabine(){
		Porte porte = new Porte(EEtatOuverture.FERME, 3);
		Porte porte1 = new Porte(EEtatOuverture.FERME, 1);
		GestionnaireServices gestserv = new GestionnaireServices();
		Etage etage = new Etage(3, gestserv, porte);
		Entrainement entrain = new Entrainement(EEtatDeplacement.ARRETE, 1);
		Cabine cabine = new Cabine(etage, porte1, entrain, 200, gestserv);
	
		assertEquals(cabine.getEtatCabine(),EEtatCabine.ARRETEFERME);
	}

}
