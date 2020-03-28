package file_handling;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
public class ByteWrite
{
	public static void main(String[] args) 
	{
		String na,ph;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		na=sc.next();
		System.out.println("Enter the Phone Number");
		ph=sc.next();
		try
		{
			File fi=new File("d://Byte,txt");
			FileOutputStream fs=new FileOutputStream(fi,false);
			byte[] n=na.getBytes();
			byte[] p=ph.getBytes();
			fs.write(n);
			fs.write(p);
			System.out.println("Record Saved");
			fs.close();
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
