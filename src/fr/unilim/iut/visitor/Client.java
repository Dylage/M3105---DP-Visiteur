package fr.unilim.iut.visitor;

public class Client {

	/**
	 * Tests des méthodes du Design Pattern "Visiteur"
	 * @param args
	 */
	public static void main(String[] args) {
		Visitor caisse = new ScanPrix();
		Visited skate = new SkateBoard();
		Visited baguette = new Baguette();
		
		// Affichage du prix TTC du skateboard
		System.out.println(skate.accept((ScanPrix) caisse));
		
		// Affichage du prix TTC d'une baguette
		System.out.println(baguette.accept((ScanPrix) caisse));

	}

}
