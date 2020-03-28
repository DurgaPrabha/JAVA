package file_handling;
public class StringPrg 
{
	public static void main(String[] args) 
	{
		String n;
		n="Durga";
		byte[] mm=n.getBytes();
		for(int i=0;i<n.length();i++)
		{
			System.out.println(n.charAt(i)+"--> "+mm[i]);
		}
	}
}
