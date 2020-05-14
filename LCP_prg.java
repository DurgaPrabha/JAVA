package prac_prg;

import java.util.Scanner;

public class LCP_prg 
{
	   public static String commonPrefixUtil(String str1, String str2)
	    { 
	        String result = ""; 
	        int n1 = str1.length(), n2 = str2.length(); 
	        for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++)
	        { 
	            if (str1.charAt(i) != str2.charAt(j))  
	                break; 
	           
	            result += str1.charAt(i); 
	        } 
	        return (result); 
	    }    
	  public static String commonPrefix(String arr[], int n) 
	  { 
	        String prefix = arr[0]; 
	  
	        for (int i = 1; i <= n-1; i++)
	           prefix = commonPrefixUtil(prefix, arr[i]); 
	         
	        return (prefix); 
	    } 
	public static void main(String[] args) 
	   { 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int x=sc.nextInt();
	        String arr[] = new String[x];
	        System.out.println("Enter the elements of Array:");
			for(int i=0;i<x;i++)
			{
				arr[i]=sc.next();
			}
			int n = arr.length;   
	        String ans = commonPrefix(arr, n);   
	     
	     	if (ans.length() > 0) 
	             System.out.println("The longest common prefix is: "+ans); 
	       	else 
	             System.out.println("There is no common prefix"); 
	    } 
}
