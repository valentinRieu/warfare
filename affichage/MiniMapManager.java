package wargame.affichage;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MiniMapManager extends MouseAdapter {

    MiniMap mm;

    public MiniMapManager(MiniMap mm){
        this.mm = mm;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int a = (e.getX()-(int)((double)(mm.getWidth()/2)-(double)(mm.w*mm.gameDisplay.ct.columns/2)))/mm.w;
        int b = (e.getY()-(int)((double)(mm.getHeight()/2)-(double)(mm.h*mm.gameDisplay.ct.rows/2)))/mm.h;
        System.out.println(mm.w + ":" + mm.h);
        if(a < 0 || b < 0){
            return;
        }
        mm.gameDisplay.goTo(b,a);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int a = (e.getX()-(int)((double)(mm.getWidth()/2)-(double)(mm.w*mm.gameDisplay.ct.columns/2)))/mm.w;
        int b = (e.getY()-(int)((double)(mm.getHeight()/2)-(double)(mm.h*mm.gameDisplay.ct.rows/2)))/mm.h;
        if(a < 0 || b < 0){
            return;
        }
        mm.gameDisplay.goTo(b,a);
    }
}
