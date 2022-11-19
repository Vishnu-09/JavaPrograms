package com.basicvishnu;
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {

		int a,b,c;
		double root1,root2;
		System.out.println("Enter the coefficients");
		Scanner in=new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		double d=b*b-4*a*c;
		System.out.println("determinant="+d);
		if(d>0)
		{
			root1=(-b+Math.sqrt(d))/(2*a);
			root2=(-b+Math.sqrt(d))/(2*a);
			System.out.println("the roots are real and distinct");
			System.out.format("root1=%.2f and root2=%.2f",root1,root2);
		}
	
