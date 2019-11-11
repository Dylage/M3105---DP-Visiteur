package fr.unilim.iut.visitor;

/**
 * Implémentation de l'interface Visiteur qui permet de relever les poids
 * @author quentin
 *
 */
public class Balance implements Visitor {

	@Override
	public double visit(Visited visite) {
		return visite.accept(this);
	}

}
