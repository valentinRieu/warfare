package wargame.carte;

import wargame.carte.types.*;

import java.io.Serializable;

public class TerrainFactory implements Serializable {
	/**
	 * Renvoie un terrain dont le type correspond au string attaché
	 * @param terrainTypeStr le type terrain
	 * @return <code>Terrain</code> - le terrain généré
	 */
	public static Terrain getTerrain(String terrainTypeStr) {
		if (terrainTypeStr == null) {
			return null;
		} else if (terrainTypeStr.equalsIgnoreCase("FORET")) {
			return new Foret();
		} else if (terrainTypeStr.equalsIgnoreCase("MONTAGNE")) {
			return new Montagne();
		} else if (terrainTypeStr.equalsIgnoreCase("PLAINE")) {
			return new Plaine();
		} else if (terrainTypeStr.equalsIgnoreCase("VILLE")) {
			return new Ville();
		} else if (terrainTypeStr.equalsIgnoreCase("EAUPROFONDE")) {
			return new EauProfonde();
		} else if (terrainTypeStr.equalsIgnoreCase("RIVIERE")) {
			return new Riviere();
		} else if (terrainTypeStr.equalsIgnoreCase("DONJON")) {
			return new Donjon();
		} else if (terrainTypeStr.equalsIgnoreCase("CHATEAU")) {
			return new Chateau();
		}

		return new Vide();
	}
}
