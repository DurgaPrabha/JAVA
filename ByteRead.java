package file_handling;
import java.io.File;
import java.io.FileInputStream;

public class ByteRead 
{
	public static void main(String[] args) 
	{
		  try
			{
				File fi=new File("d://Byte.txt");
				FileInputStream fr=new FileInputStream(fi);
				long len=fi.length();
				//char[] txt=new char[(byte) len];
				//byte[] t=new byte[(int)  ];
				//fr.read(fi);
				//System.out.println(t);
				fr.close();
			}
		  catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
