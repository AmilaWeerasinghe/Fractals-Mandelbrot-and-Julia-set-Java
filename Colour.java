package Fractals;
import java.awt.*;
public class Colour {
	
	//setColor should return int
public static int setColor(int iteration,int maxiiterations){
	
	return Color.HSBtoRGB((float) iteration / 256, 1.0f, iteration / (8.0f + (float) iteration));
}
}
