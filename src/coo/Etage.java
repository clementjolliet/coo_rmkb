package coo;

import com.sun.xml.internal.ws.wsdl.writer.document.Port;

public class Etage {
	private int numEtage;
	private boolean estEnService;
	private Porte porte;
	private GestionnaireServices gestionService;
	
	public Etage (int numEtage, GestionnaireServices gestionnaire, Porte porte){
		this.numEtage = numEtage;
		this.estEnService = true;
		this.gestionService = gestionnaire;
		this.porte = porte;
	}
	
	/*public void enregistrerGestionnaire(GestionnaireServices gestionnaire){
		this.gestionService = gestionnaire;
	}*/
	
	public void indPression(Bouton leBouton){
		gestionService.indAppel(this);
	}
	
	public void ouvrirPorte(){
		this.porte.ouvrir();
	}
	
	//On doit avoir un accesseur pour pouvoir donner le numero de l'�tage dans la m�thode reqDeplacementVers dans la classe Cabine
	public int getNumero(){
		return this.numEtage;
	}
}
