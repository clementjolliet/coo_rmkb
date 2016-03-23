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
	public void testReqMonter(){
		Entrainement entrain = new Entrainement (EEtatDeplacement.ARRETE, 1);
		
		entrain.reqMonter();
		
		assertEquals(entrain.getEtatDeplacement(), EEtatDeplacement.EN_MONTEE);
		
	}
	
	@Test
	public void testReqDescendre(){
		Entrainement entrain = new Entrainement (EEtatDeplacement.ARRETE, 2);
		
		entrain.reqDescendre();
		
		assertEquals(entrain.getEtatDeplacement(), EEtatDeplacement.EN_DESCENTE);
		
	}
	
	@Test
	public void testStop(){
		Entrainement entrain = new Entrainement (EEtatDeplacement.EN_DESCENTE, 2);
		
		entrain.reqStop();
		
		assertEquals(entrain.getEtatDeplacement(), EEtatDeplacement.ARRETE);
		
	}

}
