package COO;

public class AscenceurTest {

	public static void main(String[] args) {
		
		// dans l'immeuble les 4 étages sont 0,1,2,3 
		// 5 portes : la cabine et les 4etages
		// 8 boutons , seulement 4 a coder, ceuxdes étages
		// les messages renvoyés au harware sont simulés par des print
		
		
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
		
		Etage etage0 = new Etage(0, leGestionnaireServices); // A rajouter dans gestionnaireService la méthode qui l'enregistre dans l'attribut de l'étage
		Etage etage1 = new Etage(1, leGestionnaireServices);
		Etage etage2 = new Etage(2, leGestionnaireServices);
		Etage etage3 = new Etage(3, leGestionnaireServices);
		
		//instanciation des boutons, 
		
		Bouton boutonetage0 = new Bouton(etage0, 0);
		Bouton boutonetage1 = new Bouton(etage1, 1);
		Bouton boutonetage2 = new Bouton(etage2, 2);
		Bouton boutonetage3 = new Bouton(etage3, 3);
		
		// instanciation de la cabine à l'étage 1
		
		Cabine laCabine = new Cabine(etage1, porteCabine, entrainementCabine, 200, leGestionnaireServices); // OK
		
		
		
		// Pression du bouton 
		
		boutonetage3.indPression();
		
		// nouvelle étage
		
		entrainementCabine.indNouvelEtage(etage2);
		
		
		
	}

}
