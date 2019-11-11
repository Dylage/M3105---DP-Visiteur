package fr.unilim.iut.visitor;

/**
 * Produits alimentaires avec un taux de TVA réduit (5.5%)
 * @author quentin
 *
 */
public abstract class Nourriture implements Visited {
	protected double tauxTVA = 0.055;
	protected String nom;
	protected double prixHT;
	protected double poids;

	@Override
	public double accept(ScanPrix visiteur) {
		System.out.println(this.nom + " prix TTC : ");
		return this.prixHT + (this.tauxTVA * this.prixHT);
	}

}
