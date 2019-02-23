package Fractals;
import java.util.*;

import javax.swing.ImageIcon;
//import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fractal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard =new Scanner(System.in);
	System.out.println("Please Enter The Details: ");
	String input=keyboard.nextLine();
	
    String[] splitted=input.split(" ");
   if(splitted[0].equals("Mandelbrot")){
	   System.out.println("Mandelbrot Set selected");
	   
	   Thread thread1 = new Thread(new MandelbrotThread(0,400,0,400));
       Thread thread2 = new Thread(new MandelbrotThread(0,400,400,800));
       Thread thread3 = new Thread(new MandelbrotThread(400,800,0,400));
       Thread thread4 = new Thread(new MandelbrotThread(400,800,400,800));

       thread1.start();thread2.start();thread3.start(); thread4.start();
       try {
		thread1.join();thread2.join();thread3.join();thread4.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   //create object of Frame class to draw Mandelbrot
	   Frame frame=new Frame("This is Mandelbrot Set");
	   
	   //go through every point n the Frame
	   for(int row=0;row<800;row++){
		   for(int col=0;col<800;col++){
			//check out each point which now assigned with int called itearations and depnd on that assign colors
			  if(MandelbrotThread.array[row][col]< MandelbrotThread.maxiterations){
				  //pixel in mandelbrot(it is good create Colour class)
				  Frame.image.setRGB(col, row, Colour.setColor(MandelbrotThread.array[row][col], MandelbrotThread.maxiterations));
				  
			  } 
			  else{
				  //now not in Mandelbrot assign black
				  (Frame.image).setRGB(col, row,0);
			  } 
		   }
	   }
	   
	   //complete the frame
	   (Frame.frame).add(new JLabel(new ImageIcon(Frame.image)));
	   (Frame.frame).pack();
	   (Frame.frame).setVisible(true);
	   
	   
	// create a frame for Mandelbrot Set
		/*JFrame frame = new JFrame("Fractals Mandelbrot Set"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		// set the content of the frame as one of this panel
		frame.setContentPane(new Panel(800, 800)); 

		frame.pack(); 
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true); */
		
		//default mandelbrot set zero arguments given
		if(splitted.length==1){
			System.out.println("Default MandelBrot is ON");
		}
	   
   }
   if(splitted[0].equals("Julia")){
	   System.out.println("Julia set selected");
	// create a frame for Julia Set
			
   }
keyboard.close();



	}

}
