package wargame.soldats;

import wargame.carte.Position;

import java.awt.*;


public class Gobelin extends Monstres {

	private static final Color image = Color.DARK_GRAY;

	public Gobelin() {
		pointsDeVie = TypesM.GOBELIN.getPoints();
		porteeVisuelle = TypesM.GOBELIN.getPortee();
		puissance = TypesM.GOBELIN.getPuissance();
		tir = TypesM.GOBELIN.getTir();
		deplacement = TypesM.GOBELIN.getDeplacement()*5;
		deplacementRestant = deplacement;
	}

	public Gobelin(Position pos) {
		this();
		position = pos;
	}

	@Override
	public Color getImage() {
		return image;
	}


}
