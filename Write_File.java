package file_handling;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Write_File 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String na=sc.next();
	System.out.println("Enter the Phone Number");
	String ph=sc.next();
	try
	{
		File fi=new File("d://MobileNo.txt");
		FileWriter fw=new FileWriter(fi,true);
		fw.write(na+"\t");
		fw.write(ph+"\n");
		System.out.println("Record Saved");
		fw.close();
		sc.close();
	}
	catch(Exception e)
	{
		System.out.println(e.getLocalizedMessage());
	}
  }
}
