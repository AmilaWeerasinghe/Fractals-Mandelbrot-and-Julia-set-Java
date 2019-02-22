package Fractals;
import java.awt.*; /* java abstract window toolkit */
import java.awt.event.*; 
import javax.swing.*;
import java.awt.geom.Line2D;
import java.util.Random;
public class Panel extends JPanel {
	//size of the Panel it is given as 800 * 800 pixels 
	 private int width;
	 private int height; 
	//constructor overloading Panel
	 
	 public Panel(int width,int height){
		// set the panel size 
			this.width  = width; 
			this.height = height; 
			setPreferredSize(new Dimension(width, height)); 
		 
	 }
	
	

}
