package prac_prg;

import java.util.Scanner;
import java.lang.Math;
public class Quad_Equ {
    public static void main(String[] args) {
      double a,b,c,det;
      double x,y;
      Scanner sc=new Scanner(System.in);
      a=sc.nextDouble();
      b=sc.nextDouble();
      c=sc.nextDouble();
      det=(b*b)-(4*a*c);
      double sqt= Math.sqrt(det);
      if(det>0)
      {
      x=((-b)+sqt)/(2*a);
      y=((-b)-sqt)/(2*a);
      System.out.println(Math.round(x*100.0)/100.0);
      System.out.println(Math.round(y*100.0)/100.0);
      }
      else if(det==0)
      {
        x = y = -b/(2*a);
        System.out.println(Math.round(x*100.0)/100.0);
      	System.out.println(Math.round(y*100.0)/100.0);
      }
      else
      {
        double rp= -b/(2*a);
        double ip= Math.sqrt(-det)/(2*a);
        x=Math.round(rp*100.0)/100.0;
        y=Math.round(ip*100.0)/100.0;        
        System.out.println(x+"+"+y+"i");
        System.out.println(x+"-"+y+"i");
      }
    }
}