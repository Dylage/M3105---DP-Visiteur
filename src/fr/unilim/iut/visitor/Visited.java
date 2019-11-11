package fr.unilim.iut.visitor;

/**
 * Interface des objets visités
 * Ils doivent avoir une méthode accept pour tous les objets qui les visitent
 * @author quentin
 *
 */
public interface Visited {
	
	/**
	 * Retourne le prix TTC calculé par le visiteur
	 * @param visiteur : objet qui visite
	 * @return
	 */
	public double accept(ScanPrix visiteur);
}
