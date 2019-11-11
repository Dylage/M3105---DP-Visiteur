package fr.unilim.iut.visitor;

/**
 * Interface des objets qui visitent les objets
 * Ils doivent avoir une méthode visit pour tous les objets qu'ils doivent visiter
 * @author quentin
 *
 */
public interface Visitor {
	
	/**
	 * Retourne le prix TTC de l'objet visité
	 * @param visite : objet visité
	 * @return
	 */
	public double visit(Visited visite);
}
