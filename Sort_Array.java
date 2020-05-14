package prac_prg;
import java.util.Arrays;
public class Sort_Array 
{
	public static void main(String[] args)
	{   
		int[] num_arr = {1,11,2,22,3,33,4,44,5,55,6,66,7,77,88,99,0};
	            
	    String[] str_arr = {"Z","X","A","B","Y","Q","T","C","P","I","E","R"};        
	    System.out.println("Original numeric array : "+Arrays.toString(num_arr));
	    Arrays.sort(num_arr);
	    System.out.println("Sorted numeric array : "+Arrays.toString(num_arr));
	    
	    System.out.println("Original string array : "+Arrays.toString(str_arr));
	    Arrays.sort(str_arr);
	    System.out.println("Sorted string array : "+Arrays.toString(str_arr));
	 }
}