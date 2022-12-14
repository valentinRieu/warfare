package wargame.soldats;

import wargame.carte.Position;

import java.awt.*;

public class Orc extends Monstres{
	private static final Color image = new Color(102, 102, 51);
	public Orc() {
		pointsDeVie = TypesM.ORC.getPoints();
		porteeVisuelle = TypesM.ORC.getPortee();
		puissance = TypesM.ORC.getPuissance();
		tir = TypesM.ORC.getTir();
		deplacement = TypesM.ORC.getDeplacement();
		deplacementRestant = deplacement;
	}
	public Orc(Position pos) {
		this();
		position = pos;
	}
	/**
	 * Renvoie l'image associé à l'unité
	 * @return
	 */
	@Override
	public Color getImage() {
		return image;
	}
}
