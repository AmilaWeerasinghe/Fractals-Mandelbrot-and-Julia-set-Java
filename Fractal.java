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
	   if(splitted.length==1){
		   
		   
		   //create threads and end and start of cols and rows are the inputs
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
	   
	   }
	
		if(splitted.length==5){
			System.out.println("Mandelbrot with 4 arguments");
			
              //take input variables
            float xpositive = Float.parseFloat(splitted[1]);
            float xnegative = Float.parseFloat(splitted[2]);
            float ypositive = Float.parseFloat(splitted[3]);
            float ynegative = Float.parseFloat(splitted[4]);
            
            //System.out.println("xp "+xpositive+"yN"+ynegative);
            
           //create threads
            Thread thread1 = new Thread(new MandelbrotThread(xpositive,xnegative,ypositive,ynegative,0,400,0,400));
            Thread thread2 = new Thread(new MandelbrotThread(xpositive,xnegative,ypositive,ynegative,0,400,400,800));
            Thread thread3 = new Thread(new MandelbrotThread(xpositive,xnegative,ypositive,ynegative,400,800,0,400));
            Thread thread4 = new Thread(new MandelbrotThread(xpositive,xnegative,ypositive,ynegative,400,800,400,800));
            //start threads
            thread1.start();thread2.start();thread3.start(); thread4.start();
            //join threads
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
            
		}
		
		//for 5 arguments (with number of iterations)
	   
		if(splitted.length==6){
			System.out.println("Mandelbrot with 5 arguments");
			
              //take input variables
            float xpositive = Float.parseFloat(splitted[1]);
            float xnegative = Float.parseFloat(splitted[2]);
            float ypositive = Float.parseFloat(splitted[3]);
            float ynegative = Float.parseFloat(splitted[4]);
            int iterations=Integer.parseInt(splitted[5]);
            //System.out.println("iteratins "+iterations);
            
           //create threads Constructor with threads is used
            Thread thread1 = new Thread(new MandelbrotThread(xpositive,xnegative,ypositive,ynegative,0,400,0,400,iterations));
            Thread thread2 = new Thread(new MandelbrotThread(xpositive,xnegative,ypositive,ynegative,0,400,400,800,iterations));
            Thread thread3 = new Thread(new MandelbrotThread(xpositive,xnegative,ypositive,ynegative,400,800,0,400,iterations));
            Thread thread4 = new Thread(new MandelbrotThread(xpositive,xnegative,ypositive,ynegative,400,800,400,800,iterations));
            //start threads
            thread1.start();thread2.start();thread3.start(); thread4.start();
            //join threads
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
            
		}
		
		
		
		//
   }
   if(splitted[0].equals("Julia")){
	   System.out.println("Julia set selected");
	// create a frame for Julia Set
	   //now the values for Zn and C have changed
			//create a new class
	   if(splitted.length==1){
		  //only julia word default Julia set
		   System.out.println("Default Juliaset");
		   
		   //create threads and end and start of cols and rows are the inputs
		   Thread thread1 = new Thread(new JuliaThread(0,400,0,400));
	       Thread thread2 = new Thread(new JuliaThread(0,400,400,800));
	       Thread thread3 = new Thread(new JuliaThread(400,800,0,400));
	       Thread thread4 = new Thread(new JuliaThread(400,800,400,800));

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
				  if(JuliaThread.array[row][col]< JuliaThread.maxiterations){
					  //pixel in mandelbrot(it is good create Colour class)
					  Frame.image.setRGB(col, row, Colour.setColor(JuliaThread.array[row][col], JuliaThread.maxiterations));
					  
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
		   
		   }
	   if(splitted.length==4){
		   //C and iterations given by the user
		 //only julia word default Julia set
		   System.out.println("Juliaset C and iteations given");
		   //take C and iteartions from input
		   
		   Double real = Double.parseDouble(splitted[1]);
		   Double img = Double.parseDouble(splitted[2]);
		   int itr =Integer.parseInt(splitted[3]);
		   
		   
		   //create threads and end and start of cols and rows are the inputs constructor changed
		   Thread thread1 = new Thread(new JuliaThread(0,400,0,400,real,img,itr));
	       Thread thread2 = new Thread(new JuliaThread(0,400,400,800,real,img,itr));
	       Thread thread3 = new Thread(new JuliaThread(400,800,0,400,real,img,itr));
	       Thread thread4 = new Thread(new JuliaThread(400,800,400,800,real,img,itr));

	       thread1.start();thread2.start();thread3.start(); thread4.start();
	       try {
			thread1.join();thread2.join();thread3.join();thread4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   //create object of Frame class to draw Mandelbrot
		   Frame frame=new Frame("This is Julia Set");
		   
		   //go through every point n the Frame
		   for(int row=0;row<800;row++){
			   for(int col=0;col<800;col++){
				//check out each point which now assigned with int called itearations and depnd on that assign colors
				  if(JuliaThread.array[row][col]< JuliaThread.maxiterations){
					  //pixel in mandelbrot(it is good create Colour class)
					  Frame.image.setRGB(col, row, Colour.setColor(JuliaThread.array[row][col], JuliaThread.maxiterations));
					  
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
		   
	   }
	   if(splitted.length==3){
		   //C and iterations given by the user
		 //only julia word default Julia set
		   System.out.println("Juliaset C given");
		   //take C and iteartions from input
		   
		   Double real = Double.parseDouble(splitted[1]);
		   Double img = Double.parseDouble(splitted[2]);
		   //int itr =Integer.parseInt(splitted[3]);
		   
		   
		   //create threads and end and start of cols and rows are the inputs constructor changed
		   Thread thread1 = new Thread(new JuliaThread(0,400,0,400,real,img));
	       Thread thread2 = new Thread(new JuliaThread(0,400,400,800,real,img));
	       Thread thread3 = new Thread(new JuliaThread(400,800,0,400,real,img));
	       Thread thread4 = new Thread(new JuliaThread(400,800,400,800,real,img));

	       thread1.start();thread2.start();thread3.start(); thread4.start();
	       try {
			thread1.join();thread2.join();thread3.join();thread4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   //create object of Frame class to draw Mandelbrot
		   Frame frame=new Frame("This is Julia Set");
		   
		   //go through every point n the Frame
		   for(int row=0;row<800;row++){
			   for(int col=0;col<800;col++){
				//check out each point which now assigned with int called itearations and depnd on that assign colors
				  if(JuliaThread.array[row][col]< JuliaThread.maxiterations){
					  //pixel in mandelbrot(it is good create Colour class)
					  Frame.image.setRGB(col, row, Colour.setColor(JuliaThread.array[row][col], JuliaThread.maxiterations));
					  
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
		   
	   }   
		   
	   }
   keyboard.close();   
   }




	}

//}
