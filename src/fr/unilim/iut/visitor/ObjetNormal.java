package fr.unilim.iut.visitor;


/**
 * Objets normaux avec un taux de TVA normal (20%)
 * @author quentin
 *
 */
public abstract class ObjetNormal implements Visited {
	protected double tauxTVA = 0.2;
	protected String nom;
	protected double prixHT;
	protected double poids;
	
	
	@Override
	public double accept(ScanPrix visiteur) {
		System.out.println(this.nom + " prix TTC : ");
		return this.prixHT + (this.tauxTVA * this.prixHT);
	}

}
