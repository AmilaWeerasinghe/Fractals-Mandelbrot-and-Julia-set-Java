package Fractals;
import java.util.*;

public class Fractal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard =new Scanner(System.in);
	System.out.println("Please Enter The Details: ");
	String input=keyboard.nextLine();
	//System.out.println("the input is "+input);
	//breaking line of input
    String[] splitted=input.split(" ");
	int length=splitted.length;
	//System.out.println("the length is "+length);
	
  // System.out.println("the first world is "+splitted[0]);
   
   if(splitted[0].equals("Mandelbrot")){
	   System.out.println("Mandelbrot Set selected");
	   
   }
   if(splitted[0].equals("Julia")){
	   System.out.println("Julia set selected");
   }
keyboard.close();



	}

}
