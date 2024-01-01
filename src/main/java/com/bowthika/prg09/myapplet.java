package com.bowthika.prg09;

// Java program to run the applet 
// using the web browser

import java.awt.*;
import java.applet.*;
public class myapplet extends Applet
{
	String msg="";
	public void init()
	{
		msg="Hello Geeks";
	}

	public void start()
	{
		msg=msg+",Welcome to GeeksForGeeks";
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,20,20);
	}
}
