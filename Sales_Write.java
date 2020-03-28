package file_handling;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Sales_Write 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sales Amount");
		int sa=sc.nextInt();
		System.out.println("Enter the Sales Percentage");
		int sp=sc.nextInt();
		try
		{
			File fi=new File("d://Sales.txt");
			FileWriter fw=new FileWriter(fi,false);
			fw.write("\n"+"Sales Amount="+sa+"\n");
			fw.write("Sales Percentage="+sp+"\n");
			System.out.println("Salary Calculated!"+"\n");
			int ta=sa*5/100;
			fw.write("Your Salary is " +ta);
			fw.close();
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
