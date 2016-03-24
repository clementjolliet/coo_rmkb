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
	
	//Cabine au premier étage, nous sommes au 3, et nous appelons l'ascenseur
	@Test
	public void testGetEtatCabine(){
		Porte porte = new Porte(EEtatOuverture.FERME, 3);
		Porte porte1 = new Porte(EEtatOuverture.FERME, 1);
		GestionnaireServices gestserv = new GestionnaireServices();
		Etage etage = new Etage(3, gestserv, porte);
		Etage etage1 = new Etage(1, gestserv, porte1);
		Entrainement entrain = new Entrainement(EEtatDeplacement.ARRETE, 1);
		Cabine cabine = new Cabine(etage, porte1, entrain, 200, gestserv);
	
		assertEquals(cabine.getEtatCabine(),EEtatCabine.ARRETEFERME);
	}

	//Cabine change d'étage
	@Test
	public void testIndNouvelEtage(){
		Porte porte = new Porte(EEtatOuverture.FERME, 3);
		Porte porte1 = new Porte(EEtatOuverture.FERME, 1);
		GestionnaireServices gestserv = new GestionnaireServices();
		Etage etage = new Etage(3, gestserv, porte);
		Etage etage1 = new Etage(1, gestserv, porte1);
		Entrainement entrain = new Entrainement(EEtatDeplacement.ARRETE, 1);
		Cabine cabine = new Cabine(etage1, porte1, entrain, 200, gestserv);
		
		Bouton boutonetage3 = new Bouton(etage, 12);
		boutonetage3 .indPression();
		
		cabine.indNouvelEtage(etage);
		
		assertEquals(cabine.getEtage().getNumero(), 3);

	}
}
