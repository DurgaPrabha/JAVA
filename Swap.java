package oops_prg;
import java.util.Scanner;
public class Swap 
{ 
	static int a;
	static int b;
	int t;
public void num(int m,int n)
  {
		a=m;
		b=n;
		System.out.println("Before Swapping:");
		System.out.println(a+" "+b);
		t=a;
		a=b;
		b=t;
	    return;
  }
public static void main(String[] args) 
  {
	int p,q;
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter numbers:");
	p=sc.nextInt();
	q=sc.nextInt();
	Swap c=new Swap();
	c.num(p, q);
	System.out.println("After swapping");
	System.out.println(a+" "+b);
	sc.close();
  }
}
