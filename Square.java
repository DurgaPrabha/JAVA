package oops_prg;

import java.util.Scanner;

public class Square 
{ 
	double a,b,c,d;
    public void numcalc(int s)
    {
    	a=s;
    	b=a*a;
    	c=Math.sqrt(a);
    	d=a*a*a;
    	return;
    }
    public void data()
    {
    	System.out.println("Square value:"+b);
    	System.out.println("Squareroot value:"+c);
    	System.out.println("cube value:"+d);
    }
	public static void main(String[] args) 
	{
	int n;
	Square m=new Square();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	n=sc.nextInt();
	m.numcalc(n);
	m.data();
	sc.close();
	}

}
