package coo;

public class Entrainement {
	 private int numero;
	 private Cabine laCabine;
	 private EEtatDeplacement etatDeplacement;
	 
	 public Entrainement(EEtatDeplacement etatDeplacement, int numero){
		 this.etatDeplacement = etatDeplacement;
		 this.numero = numero;
	 }
	 
	 public void enregistrerCabine(Cabine laCabine){
		 this.laCabine = laCabine;
	 }
	 
	 public EEtatDeplacement getEtatDeplacement(){
		 return etatDeplacement;
	 }
	 
 	 public void reqMonter(){
 		System.out.println("envoi du message 'monter' au hardware");
		this.etatDeplacement = EEtatDeplacement.EN_MONTEE;
	 }
	 
	 public void reqStop(){
		 System.out.println("envoi du message 'stop' au hardware");
			this.etatDeplacement = EEtatDeplacement.ARRETE;
		 return;
 	 }


	 public void indNouvelEtage(Etage nouvelEtage){
		 //
		 //
		 laCabine.indNouvelEtage(nouvelEtage);
		 //
		 //
		 return;
	 }
}
