package com.bowthika.prg10;
import java.awt.*;
import java.applet.*;
public class FontColor extends Applet{
    public void paint(Graphics g){
        g.setFont(new Font("Arial",Font.BOLD,26));
        g.setColor(Color.blue);
        g.drawString("This is java applet",20,90);
        g.drawString("Arial font.Bold,size:26",20,90);
        g.drawString("Text color:blue",20,120);
    }
}
