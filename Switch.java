package com.basicvishnu;
import java.util.*;

class Switch 
{
	
public static void main(String[] args) {
		
Scanner ip=new Scanner(System.in);
System.out.println("enter your operator +  - * /");
char operator=ip.next().charAt(0);
System.out.println("enter your first command");
double first=ip.nextInt();
System.out.println("enter your second command");
double second=ip.nextInt();
double result=0;
switch(operator)
{
	
	result=first/second;
	  System.out.println("the result is:" +first+operator+second+"="+result);
	  break;
	  default :
		  System.out.println("invalid operator");
		  break;
}
}
}
