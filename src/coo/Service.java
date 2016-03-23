package coo;

public class Service{
	private ETypeService type;
	private int heure;
	private Etage lEtage;
	
	public Service(Etage lEtage, ETypeService type){
		this.lEtage = lEtage;
		this.type = type;
		this.heure = 4;
		
	}
	
	//On doit avoir un accesseur pour pouvoir donner le type de service dans la méthode memoriserAppel dans la classe GestionnaireServices
	public ETypeService getTypeService(){ 
		return type;
	}
	
	public Etage getEtage(){
		return lEtage;
	}
}