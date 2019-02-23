
package Fractals;

public class JuliaThread implements Runnable {
	//variables needed
	private double real;
	private double imaginery;
	public static int maxiterations;
	
	//2 d array 
	static int[][] array=new int [800][800];
	
	//to go through the pixels
	private int rowstart;
	private int rowend;
	private int colstart;
	private int colend;
	
	//coordinates
	private double xpositive=1;
	private double xnegative=-1;
	private double ypositive=1;
	private double ynegative=-1;
	
	//canvas
	private int height=800;
	private int width=800;
	
	//constructors
	//without values for c
	
	public JuliaThread (int rowstart,int rowend,int colstart,int colend){
		this.real=-0.4;
		this.imaginery=0.6;
		maxiterations=1000;
		this.rowstart= rowstart;
		this.rowend=rowend;
		 this.colstart=colstart;
		 this.colend=colend;
		}
	//with c
	public JuliaThread (int rowstart,int rowend,int colstart,int colend,double re,double im){
		this.real=re;
		this.imaginery=im;
		maxiterations=1000;
		this.rowstart= rowstart;
		this.rowend=rowend;
		 this.colstart=colstart;
		 this.colend=colend;
		}
	//with c and iterations
	public JuliaThread (int rowstart,int rowend,int colstart,int colend,double re,double im,int iiterations){
		this.real=re;
		this.imaginery=im;
		maxiterations=iiterations;
		this.rowstart= rowstart;
		this.rowend=rowend;
		 this.colstart=colstart;
		 this.colend=colend;
		}
	public void run(){
		
		for(int row=rowstart;row<rowend;row++){
			for(int col=colstart;col<colend;col++){
				
				// mapping pixels to the complex plain
                double c_im = (double) (this.ypositive - ((this.ypositive - this.ynegative) / this.height * row));
                double c_re = (double) (this.xnegative - ((this.xnegative - this.xpositive) / this.width * col));
                
                //new Zn
                ComplexNum Zn=new ComplexNum(c_re,c_im);
                ComplexNum c=new ComplexNum(real,imaginery);
                //do calculations
                int iterations=0;
                ComplexNum Znew=new ComplexNum();
                while(ComplexNum.absl(Zn)<2 && iterations<maxiterations){
                	Znew=ComplexNum.add(ComplexNum.square(Zn), c);
                	Zn=Znew;
                	iterations++;
                	
                }
                //assign the number of iterations to each point for future use
                array[row][col]=iterations;
                
				
			}
		}
		
		
	}

}
