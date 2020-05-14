package prac_prg;
import java.util.Scanner;
public class Prime_prg 
{
	public static void main(String args[])
	{    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int n=sc.nextInt();
		int flag=0; 
		if(n==0 || n==1) 
		{
			System.out.println(n+" is not a prime number");
		}
		else
		{
			for(int j=2;j<=(n/2);j++)
			 {      
				   if(n%j==0)
					    {      
						   flag=1;
						   break;
					    }
			 }
		}
					   
			 if(flag==0)
				{
					System.out.println(n +" is a prime number");
				}
			 else
			 {
				 System.out.println(n +" is not a prime number");
			 }
	}   
 }