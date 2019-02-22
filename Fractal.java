package Fractals;
import java.util.*;

import javax.swing.JFrame;

public class Fractal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard =new Scanner(System.in);
	System.out.println("Please Enter The Details: ");
	String input=keyboard.nextLine();
	//System.out.println("the input is "+input);
	//breaking line of input
    String[] splitted=input.split(" ");
	//int length=splitted.length;
	//System.out.println("the length is "+length);
	
  // System.out.println("the first world is "+splitted[0]);
   
   if(splitted[0].equals("Mandelbrot")){
	   System.out.println("Mandelbrot Set selected");
	// create a frame for Mandelbrot Set
		JFrame frame = new JFrame("Fractals Mandelbrot Set"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		// set the content of the frame as one of this panel
		frame.setContentPane(new Panel(800, 800)); 

		frame.pack(); 
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true); 
		
		//default mandelbrot set zero arguments given
		if(splitted.length==1){
			System.out.println("Default MandelBrot is ON");
		}
	   
   }
   if(splitted[0].equals("Julia")){
	   System.out.println("Julia set selected");
	// create a frame for Julia Set
			JFrame frame = new JFrame("Fractals Julia Set"); 
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

			// set the content of the frame as one of this panel
			frame.setContentPane(new Panel(800, 800)); 

			frame.pack(); 
			frame.setLocationRelativeTo(null); 
			frame.setVisible(true); 
   }
keyboard.close();



	}

}
