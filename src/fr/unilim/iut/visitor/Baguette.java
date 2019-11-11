package fr.unilim.iut.visitor;

/**
 * Implémentation test d'un produit alimentaire avec taux de TVA réduit
 * @author quentin
 *
 */
public class Baguette extends Nourriture {
	public Baguette() {
		this.nom = "Baguette";
		this.prixHT = 0.90;
		this.poids = 0.100;
	}
}
