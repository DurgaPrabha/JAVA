package oops_prg;
class Durga
{
	public void infoDurga()
	{
		System.out.println("I'm Durga");
		System.out.println("I live in Salem");
	}
}
class Loki
{
	public void infoLoki()
	{
		System.out.println("I'm Loki");
		System.out.println("I'm Durga's BestFriend");
		System.out.println("I live in Chennai");
	}
}
class Anu
{
	public void infoAnu()
	{
		System.out.println("I'm Ananyaa");
		System.out.println("I'm Durga's Bestie");
		System.out.println("I live in Coimbatore");
	}
}
public class Multi_Class 
{
	public static void main(String[] args) 
	{
		Durga d1=new Durga();
		d1.infoDurga();
		System.out.println("====================================");
		Loki d2=new Loki();
		d2.infoLoki();
		System.out.println("====================================");
		Anu a1=new Anu();
		a1.infoAnu();
		System.out.println("====================================");
	}
}
