package oops_prg;
import java.util.Scanner;
public class ForPrg 
{
	public static void main(String[] args) 
	{
	int a,b,c,i;
	Scanner sc=new Scanner(System.in);
	for(i=1;i<=5;i++)
	{
		System.out.println("Enter A and B values 5 of "+i+"?");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("A value is"+a);
		System.out.println("B value is"+b);
		System.out.println("Adding 2 value is"+c);
		System.out.println("===============");
	}
	sc.close();
	}

}
