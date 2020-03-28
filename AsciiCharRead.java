package file_handling;

import java.io.File;
import java.io.FileReader;

public class AsciiCharRead 
{
	public static void main(String[] args) 
	{
		int i;
		char m;
		try
		{
			File fi=new File("d://MobileNo.txt");
			FileReader fr=new FileReader(fi);
			//long len=fi.length();
			//int[] i=new int[(char)m];
			System.out.println("Character converted");
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
