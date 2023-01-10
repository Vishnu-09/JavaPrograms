import java.util.Scanner;
class Moverloading {

int add(int a,int b)
{
  int sum=a+b;
  return sum;
}
int add(int a,int b,int c)
{
 int sum=a+b+c;
  return sum;
}


float add(float a,float b)
{
float  sum=a+b;
  return sum;
}
}
class moverload
{
	public static void main(String[] args)
	{
		Moverloading obj=new Moverloading();
	int s1=obj.add(10,20);
