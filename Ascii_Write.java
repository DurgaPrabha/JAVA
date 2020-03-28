package file_handling;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ascii_Write 
{
	public static void main(String[] args) 
	{
		int i;
		char m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		i=sc.nextInt();
		System.out.println("Number converted to Char");
		try
		{
			File fi=new File("d://Ascii.txt");
			FileWriter fw=new FileWriter(fi,true);
			fw.write(i);
			fw.close();
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
