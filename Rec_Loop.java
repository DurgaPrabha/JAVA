package oops_prg;
public class Rec_Loop 
{
	int c=0;
	public void dispMess()
	{
		c++;
		if(c<=10)
		{
			System.out.println("Welcome");
			dispMess();
		}
	}
	public static void main(String[] args) 
	{
		Rec_Loop rp=new Rec_Loop();
		rp.dispMess();
	}
}
