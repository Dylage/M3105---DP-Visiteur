package fr.unilim.iut.visitor;

/**
 * Implémentation de l'interface Visiteur qui permet de relever les prix TTC
 * @author quentin
 *
 */
public class ScanPrix implements Visitor {

	@Override
	public double visit(Visited visite) {
		
		return visite.accept(this);
	}

}
