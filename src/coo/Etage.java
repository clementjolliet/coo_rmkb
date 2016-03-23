package coo;

public class Etage {
	private int numEtage;
	private boolean estEnService;
	private GestionnaireServices gestionService;
	
	public Etage (int numEtage, GestionnaireServices gestionnaire){
		this.numEtage = numEtage;
		this.estEnService = true;
		this.gestionService = gestionnaire;
	}
	
	/*public void enregistrerGestionnaire(GestionnaireServices gestionnaire){
		this.gestionService = gestionnaire;
	}*/
	
	public void indPression(Bouton leBouton){
		//
		//
		gestionService.indAppel(this);
		//
		//
		return;
	}
	
	//On doit avoir un accesseur pour pouvoir donner le numero de l'étage dans la méthode reqDeplacementVers dans la classe Cabine
	public int getNumero(){
		return this.numEtage;
	}
}
