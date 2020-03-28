package file_handling;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class AsciiCharWrite
{
	public static void main(String[] args)
	{
		int i;
		char m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		m=sc.next().charAt(0);
		System.out.println("Character converted");
		try
		{
			File fi=new File("d://AsciiChar.txt");
			FileWriter fw=new FileWriter(fi,false);
			//char[] txt=new char[(int) m];
			//doubt,
			i=(char)m;
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
