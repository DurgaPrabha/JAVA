package prac_prg;
import java.util.Scanner;
public class Search_Arr 
{
	public static boolean contains(int[] arr, int item)
	  {
		      for (int n : arr) 
		      {
		         if (item == n) 
		         {
		            return true;
		         }
		      }
		      return false;
	 }
   public static void main(String[] args) 
	  {
			  char s;
			  Scanner sc=new Scanner(System.in);
			  int[] my_arr = {12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,0};
			  do
			  {
			  System.out.println("Enter the number to check: ");
			  int a=sc.nextInt();
		      System.out.println(contains(my_arr, a));
		      s=sc.next().charAt(0);
			  }while(s=='y');
	  }
}
