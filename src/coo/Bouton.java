package coo;

public class Bouton {
	private int numero;
	private EEtatBouton etatBouton; 
	private Etage lEtage;
	
	public Bouton (Etage lEtage, int numero){
		this.lEtage =lEtage;
		this.numero = numero;
		this.etatBouton = EEtatBouton.EN_SERVICE;
	}
	
	public void indPression(){
		//
		//
		System.out.println("Pression à l'étage" + this.lEtage.getNumero());
		lEtage.indPression(this);
		//
		//
		return;
	}
	
	public int getNumBouton(){
		return numero;
	}
	
	public Etage getEtage(){
		return lEtage;
	}
}
