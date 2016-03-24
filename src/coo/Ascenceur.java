package coo;

public class Ascenceur {

	public static void main(String[] args) {
		
		// dans l'immeuble les 4 �tages sont 0,1,2,3 
		// 5 portes : la cabine et les 4etages
		// 8 boutons , seulement 4 a coder, ceuxdes �tages
		// les messages renvoy�s au harware sont simul�s par des print
		
		
		//instanciation des portes OK
		
		Porte porteEtage0 = new Porte(EEtatOuverture.FERME, 0);
		Porte porteEtage1 = new Porte(EEtatOuverture.FERME, 1);
		Porte porteEtage2 = new Porte(EEtatOuverture.FERME, 2);
		Porte porteEtage3 = new Porte(EEtatOuverture.FERME, 3);
		Porte porteCabine = new Porte(EEtatOuverture.FERME, 4);
		
		//instanciation de l'entrainement
		
		Entrainement entrainementCabine = new Entrainement(EEtatDeplacement.ARRETE, 0); // OK
		
		// instanciation du gestionnaire de service
		
		GestionnaireServices leGestionnaireServices = new GestionnaireServices();
		
		// instanciation des étages
		
		Etage etage0 = new Etage(0, leGestionnaireServices, porteEtage0); // A rajouter dans gestionnaireService la m�thode qui l'enregistre dans l'attribut de l'�tage
		Etage etage1 = new Etage(1, leGestionnaireServices, porteEtage1);
		Etage etage2 = new Etage(2, leGestionnaireServices, porteEtage2);
		Etage etage3 = new Etage(3, leGestionnaireServices, porteEtage3);
		
		//instanciation des boutons, 
		
		Bouton boutonetage0 = new Bouton(etage0, 0);
		Bouton boutonetage1 = new Bouton(etage1, 1);
		Bouton boutonetage2 = new Bouton(etage2, 2);
		Bouton boutonetage3 = new Bouton(etage3, 3);
		
		// instanciation de la cabine � l'�tage 1
		
		Cabine laCabine = new Cabine(etage1, porteCabine, entrainementCabine, 200, leGestionnaireServices); // OK
		
		
		
		// Pression du bouton 
		
		boutonetage3.indPression();
		
		// nouvelle étage
		
		entrainementCabine.indNouvelEtage(etage2);
		
		entrainementCabine.indNouvelEtage(etage3);
		
	}

}
