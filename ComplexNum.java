package Fractals;

public class ComplexNum {
private double real;
private double imaginery;
//because complex numbers contain two parts

//constructors
//first for Zn=0 this can be called
public ComplexNum(){
	this.real=(double)0;
	this.imaginery=0;
}
public ComplexNum(double x,double y){
	this.real=x;
	this.imaginery=y;
	
}

public static double absl(ComplexNum x){
	
	return Math.abs((Math.sqrt((x.real*x.real)+(x.imaginery*x.imaginery))));
}
//square method to complex number
public static ComplexNum square(ComplexNum x){
	double real=x.real;
	double imag=x.imaginery;
	
	return (new ComplexNum((real*real-imag*imag),(2*real*imag)));
	
}
//add method to complex numbers
public static ComplexNum add(ComplexNum x,ComplexNum y){
	return(new ComplexNum((x.real+y.real),(x.imaginery+y.imaginery)));
	
}



}
