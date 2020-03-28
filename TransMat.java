package java_prg;
import java.util.Scanner;
public class TransMat 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows required:");
		int x=sc.nextInt();
		System.out.println("Enter the number of columns required:");
		int y=sc.nextInt();
		
		int a[][] = new int[x][y];
		
		System.out.println("Enter the elements of matrix:");
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix before transpose:");
		    for(int i=0;i<x;i++)
			    {
		          for(int j=0;j<y;j++)
			     	{
				    	System.out.print(a[i][j]+" ");
			     	}
		          System.out.println("");
		         }
		System.out.println("Matrix after transpose:");
			for(int i=0;i<y;i++)
			{
				for(int j=0;j<x;j++)
				{
					System.out.print(a[j][i]+" ");
				}
			   System.out.println(""); 
			}
	  }
}
