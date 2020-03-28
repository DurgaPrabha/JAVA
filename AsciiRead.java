package file_handling;
import java.io.File;
import java.io.FileReader;
public class AsciiRead 
{
   public static void main(String[] args) 
   {
	   try
		{
			File fi=new File("d://Ascii.txt");
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
