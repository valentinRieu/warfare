package wargame.affichage;

import javax.swing.*;
import java.awt.*;

public class MiniMap extends JPanel {
    MiniMap(){
        super();
        setPreferredSize(new Dimension(Option.WIDTH/4,Option.HEIGHT/4));
        setBackground(Color.WHITE);

    }
}