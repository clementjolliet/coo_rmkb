package coo;

public class GestionnaireServices {
	private Cabine laCabine;
	private static Service leService;
	
	public void enregistrerGestionnaire(Cabine laCabine){
		this.laCabine = laCabine;
	}
	
	public void indAppel(Etage lEtage){
		System.out.println("Cabine � l'�tage" + this.laCabine.getEtage().getNumero());
		if(laCabine.getEtatCabine().equals(EEtatCabine.ARRETEFERME)){
			this.memoriserAppel(lEtage, ETypeService.APPEL);
			laCabine.reqDeplacementVers(lEtage);
		}
	}
	
	private void memoriserAppel(Etage lEtage, ETypeService leType){
		leService = new Service(lEtage, leType);
	}
	
	public void indNouvelEtage(Etage nouvelEtage){
		this.reqcompareEtage(nouvelEtage);
	}
	
	public boolean reqcompareEtage(Etage nouvelEtage){
		System.out.println("On arrive � l'�tage" + nouvelEtage.getNumero());
		if(nouvelEtage.equals(leService.getEtage())){
			System.out.println("On arr�te l'ascenceur");
			return true;
		}
		System.out.println("On continue de monter");
		return false;
	}
}
