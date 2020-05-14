package oops_prg;
public class Vari_Data 
{
	public void dispData(int...n)
	{
		System.out.println("Address "+n);
		System.out.println("Length "+n.length);
		System.out.println("=================================");
		for(int m:n)
		{
			System.out.println(m);
		}
	}
	public void dispInfo(String m,double...n)
	{
		System.out.println("Name is "+m);
		System.out.println("Address is"+n);
		System.out.println("Size "+n.length);
		System.out.println("==================================");
		for(double mm:n)
		{
			System.out.println(mm);
		}
	}
	public static void main(String[] args) 
	{
		Vari_Data vd=new Vari_Data();
		vd.dispData(12,13,14,15);
		vd.dispData(1,2);
		System.out.println("==================================");
		
		vd.dispInfo("Danny", 12,23,34,45,56);
		vd.dispInfo("Soumi", 12,23,34);
		System.out.println("==================================");
	}

}
