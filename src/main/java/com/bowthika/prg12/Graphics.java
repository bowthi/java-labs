package com.bowthika.prg12;
import java.applet.*;
import java.awt.*;

public class Graphics extends Applet{
    int x;
    int y;
    int z;
    public void paint(Graphics g){
        setBackground(Color.BLACK);
        g.setColor(Color.RED);
        g.fillRoundRect(x,y+20,100,40,5,5);
        g.fillRoundRect(x+90,y+20,0,40,270,180);
        g.setColor(Color.BLUE);
        g.fillRect(x+20,y+5,20,25);
        g.fillRect(x+50,y+5,20,25);
        g.fillColor(Color.GREEN);
        g.fillRoundRect(x+55,y+10,10,20,10,20);
        g.setColor(Color.YELLOW);
        g.fillOval(x+15,y+55,10,10);
        g.fillOval(x+65,y+55,10,10);


    }

}
