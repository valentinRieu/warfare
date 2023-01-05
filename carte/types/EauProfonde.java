package wargame.carte.types;

import wargame.carte.Infranchissable;
import wargame.carte.Terrain;

import java.awt.*;

public class EauProfonde extends Terrain implements Infranchissable {

    private static final Color color =  Color.BLUE;

    public EauProfonde() {
        this.coutDeplacement = 0;
        this.bonusDefense = 0;
    }

    @Override
    public Color getImage() {
        return color;
    }
}