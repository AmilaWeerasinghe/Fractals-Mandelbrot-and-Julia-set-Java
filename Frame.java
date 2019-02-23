package Fractals;

import java.awt.image.BufferedImage;

import javax.swing.JFrame;
//this class was created because Mandelbrot set is Drawn on JFrame
public class Frame extends JFrame {
//variables
	public static JFrame frame;//variable of JFrame
	public int width =800;
	public int height= 800;//pixels 800*800 area needed
	public static BufferedImage image;// the image is taken because it has (0,0) coordinates
	
	//constructor input is name
	public Frame(String set){
		frame=new JFrame(set);//frame variable of JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//assign to close on exit
		frame.setSize(800,800);//every Frame is of this size
		frame.setLocationRelativeTo(null);//no any relative location
		image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);//this constructor for BufferedImage is selected+ 
	}
	
	
	
	
}
