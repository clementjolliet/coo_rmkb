package COO;

public class Cabine {
	 private int poidsMax;
	 private Etage etageCourant;
	 private Porte porteCabine;
	 private Entrainement entrainementCabine;
	 private GestionnaireServices gestionnaireServices;
	 
	 
	 public Cabine( Etage etageCourant, Porte porteCabine, Entrainement entrainementCabine, int poidsMax, GestionnaireServices gestionnaireServices){
		 this.entrainementCabine = entrainementCabine;
		 this.porteCabine = porteCabine;
		 this.etageCourant = etageCourant;
		 this.poidsMax = poidsMax;
		 this.gestionnaireServices = gestionnaireServices;
		 this.entrainementCabine.enregistrerCabine(this);
		 this.gestionnaireServices.enregistrerGestionnaire(this);
	 }
	 
	  
	public EEtatCabine getEtatCabine(){
		 EEtatCabine etatCabine = null; 
		 String strEtatCabine = entrainementCabine.getEtatDeplacement()+"";
		 strEtatCabine += porteCabine.getEtatOuverture()+"";
		 switch (strEtatCabine){
		 case "ARRETEOUVERT":
			 etatCabine = EEtatCabine.ARRETEOUVERT;
		 break;
		 case "ARRETEFERME":
			 etatCabine = EEtatCabine.ARRETEFERME;
		 break;
		 case "EN_DESCENTEFERME":
			 etatCabine = EEtatCabine.EN_DESCENTEFERME;
		 break;
		 case "EN_MONTEEFERME":
			 etatCabine = EEtatCabine.EN_MONTEEFERME;
		 break;
		 }
		 return etatCabine;
	 }
	
	 public void reqDeplacementVers(Etage etageDemande){
		 //
		 //
		 if (etageDemande.getNumero() > etageCourant.getNumero()){
			 entrainementCabine.reqMonter();
		 }
		 else if (etageDemande.getNumero() < etageCourant.getNumero()){
			 entrainementCabine.reqDescendre();
		 }
		 //
		 //
		 return;
	 }
	 
	 public Etage getEtage(){ // Rajouté uniquement pour pouvoir print certains messages
		 return this.etageCourant;
	 }
	 
	 private void setEtage(Etage nouvelEtage){ // Correspond sur les diagrammes de conception à la méthode metAJour
		 etageCourant = nouvelEtage;
	 }
	 
	 public void indNouvelEtage(Etage nouvelEtage){
		 //
		 //
		 this.setEtage(nouvelEtage);
		 //
		 //
		 this.gestionnaireServices.indNouvelEtage(nouvelEtage);
		 //
		 //
		 return;
	 }
}
