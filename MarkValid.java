package oops_prg;
import java.util.Scanner;
public class MarkValid 
{
public static void main(String[] args) 
	{
	 int rno,t=0,e=0,m=0,s=0,h=0,tot;
	 double avg;
	 boolean tt=true;
	 String na;
	 String res = null;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter roll number:");
	 rno=sc.nextInt();
	 System.out.println("Enter name:");
	 na=sc.next();
	 while(tt)
	 {
		 System.out.println("Enter Tamil mark:");
		 t=sc.nextInt();
		 if(t<0||t>100)
			 System.out.println("Out of range,Enter valid marks...!");
		 else
			 tt=false;
	 }
	 tt=true;
	 while(tt)
		 {
		 System.out.println("Enter English mark:");
		 e=sc.nextInt();
		 if(e<0||e>100)
			 System.out.println("Out of range,Enter valid marks...!");
		 else
			 tt=false;
		 }
	 tt=true;
	 while(tt)
	 {
		 System.out.println("Enter Maths mark:");
		 m=sc.nextInt();
		 if(m<0||m>100)
		   System.out.println("Out of range,Enter valid marks...!");
		 else
			 tt=false;
		 }
	 tt=true;
	 while(tt)
	 {
		 System.out.println("Enter Science mark:");
		 s=sc.nextInt();
		 if(s<0||s>100)
			 System.out.println("Out of range,Enter valid marks...!");
		 else
			 tt=false;
	 }
	 tt=true;
	 while(tt)
	 {
		 System.out.println("Enter social mark:");
		 h=sc.nextInt();
		 if(h<0||h>100)
			 System.out.println("Out of range,Enter valid marks...!");
		 else
			 tt=false;
	 }
			 tot=t+e+m+s+h;
			 avg=tot/5;
			 
			 if(t<40 || e<40 || m<40 || s<40 || h<40)
				 res="Fail";
			 else if(avg>=80)
				 res="Honour";
			 else if(avg>=70 && avg<80)
				 res="First class";
			 else if(avg>=60 && avg<70)
				 res="Second class";
			 else if(avg<=50 && avg<60)
				 res="Third class";
			 else
				 System.out.println("Pass");
			 
			 System.out.println("====================================================");
			 System.out.println("\t\t**ABC SCHOOL**");
			 System.out.println("=====================================================");
			 System.out.print("ROLL NO:"+rno);
			 System.out.println("\t        NAME: "+na);
			 System.out.println("-----------------------------------------------------");
			 System.out.println("Tamil mark:"+t);
			 System.out.println("English mark:"+e);
			 System.out.println("Maths mark:"+m);
			 System.out.println("Science mark:"+s);
			 System.out.println("Social mark:"+h);
			 System.out.println("-----------------------------------------------------");
			 System.out.println("Total mark:"+tot);
			 System.out.println("Average mark:"+avg);
			 System.out.println("-----------------------------------------------------");
			 System.out.println("Result:"+res);
			 sc.close();
	}
}
