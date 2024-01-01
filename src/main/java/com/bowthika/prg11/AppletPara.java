package com.bowthika.prg11;
import java.applet;
import java.awt.Graphics;

public class AppletPara extends Applet {
    String p,c;
    public void init(){
        p = getParameter("place")
        c = getParameter("college")
    } 
    public void paint(Graphics g){
        g.drawString(c,80,20);
        g.drawString(p,100,40)
    }
}
