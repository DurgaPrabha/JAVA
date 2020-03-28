package prac_prg;
import java.util.Scanner;
public class RevStrArr {
	public void revArr(char chr[],int start,int end)
	{
		char temp;
		while(start<end)
		{
			temp=chr[start];
			chr[start]=chr[end];
			chr[end]= temp;
			start++;
			end--;
		}
	}
		public void printArr(char chr[], int a)
		{
			for(int i=0;i<a;i++)
			{
				System.out.print(chr[i]+" ");
			}
			System.out.println();
		}
	public static void main(String[] args) 
	{
		RevStrArr rv=new RevStrArr();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		char[] chr=str.toCharArray();
		rv.printArr(chr,chr.length);
		rv.revArr(chr, 0,chr.length-1);
		rv.printArr(chr, chr.length);

	}

}
