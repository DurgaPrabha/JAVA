package oops_prg;	
interface Switch
{
public void on();
public void off();
}
class Fan implements Switch
{

	@Override
	public void on() 
	{
	System.out.println("Fan is on");	
	}

	@Override
	public void off() 
	{
	System.out.println("Fan is off");
	}
}
class Bulb implements Switch
{

	@Override
	public void on() 
	{
	System.out.println("Bulb is on");	
	}

	@Override
	public void off() 
	{
		System.out.println("Bulb is off");
	}
}
public class Interface
{
	public static Switch Press(char m)
	{
		if(m=='F')
			return new Fan();
		else
			return new Bulb();
	}
	public static void main(String[] args) 
	{
		/*Abstraction ab=new Abstraction();
		Switch ss=ab.Press('B');
		ss.on();
		ss.off();
		Switch ss=Abstraction.Press('B');
		ss.off();
		ss.on();*/
	}
	}
