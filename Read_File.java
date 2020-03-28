package file_handling;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Read_File 
{
	public static void main(String[] args) 
	{
		try
		{
			File fi=new File("d://MobileNo.txt");
			FileReader fr=new FileReader(fi);
			long len=fi.length();
			char[] txt=new char[(int) len];
			fr.read(txt);
			System.out.println(txt);
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
