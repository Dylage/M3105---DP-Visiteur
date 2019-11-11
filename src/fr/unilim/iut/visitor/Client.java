package fr.unilim.iut.visitor;

public class Client {

	/**
	 * Tests des méthodes du Design Pattern "Visiteur"
	 * @param args
	 */
	public static void main(String[] args) {
		Visitor caisse = new ScanPrix();
		Visited skate = new SkateBoard();
		
		// Affichage du prix TTC du skateboard
		System.out.println(skate.accept((ScanPrix) caisse));
	}

}
