package COO;

public class Porte {
	 private int numero;
	 private EEtatOuverture etatOuverture;
	 
	 public Porte (EEtatOuverture etatOuverture, int numero){
		 this.etatOuverture = etatOuverture;
		 this.numero = numero;
	 }
	 
	//On doit avoir un accesseur pour pouvoir donner l'�tat d'ouverture de la porte dans la m�thode getEtatCabine dans la classe Cabine
	 public EEtatOuverture getEtatOuverture(){
		 return this.etatOuverture;
	 }

}
