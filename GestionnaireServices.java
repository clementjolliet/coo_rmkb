package COO;

public class GestionnaireServices {
	private Cabine laCabine;
	private static Service leService;
	
	public void enregistrerGestionnaire(Cabine laCabine){
		this.laCabine = laCabine;
	}
	
	public void indAppel(Etage lEtage){
		//
		//
		System.out.println("Cabine à l'étage" + this.laCabine.getEtage().getNumero());
		if(laCabine.getEtatCabine().equals(EEtatCabine.ARRETEFERME)){
			//
			this.memoriserAppel(lEtage, ETypeService.APPEL);
			//
			laCabine.reqDeplacementVers(lEtage);
		}
		//
		//
	}
	
	private void memoriserAppel(Etage lEtage, ETypeService leType){
		//
		//
		leService = new Service(lEtage, leType);
		//
		//
	}
	
	public void indNouvelEtage(Etage nouvelEtage){
		this.reqcompareEtage(nouvelEtage);
	}
	
	public boolean reqcompareEtage(Etage nouvelEtage){
		System.out.println("On arrive à l'étage" + nouvelEtage.getNumero());
		if(nouvelEtage.equals(leService.getEtage())){
			System.out.println("On arrête l'ascenceur");
			return true;
		}
		System.out.println("On continue de monter");
		return false;
	}
}
