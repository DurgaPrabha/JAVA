package oops_prg;
import java.util.Scanner;
public class Split 
{
	int a,b,c,d,n;
	public void split(int num)
	{
		n=num;
		a=n/1000;
		n=n%1000;
	    b=n/100;
	    n=n%100;
	    c=n/10;
	    n=n%10;
	    d=n/1;
	    n=n%1;
	    System.out.printf("%d thousands\n",a);
	    System.out.printf("%d hundreds\n",b);
	    System.out.printf("%d tens\n",c);
	    System.out.printf("%d ones\n",d);
	    return;
	 }

	 public static void main(String[] args) 
	 {
	
		int num1;
		Scanner sc=new Scanner(System.in);
		Split s1=new Split();
		s1.split(3452);
		System.out.println("===========");
		
		Split s2=new Split();
		System.out.println("Enter numbers");
		num1=sc.nextInt();
		s2.split(num1);
		sc.close();
	}
}
