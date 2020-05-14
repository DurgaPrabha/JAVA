package prac_prg;
import java.util.Scanner;
import java.lang.Math;
public class Temp_prg {
    public static void main(String[] args) {
      double b,a;
      double c;
      Scanner sc=new Scanner(System.in);
      a=sc.nextDouble();
      b=((a*9)/5)+32;
      c=Math.round(b*1000)/1000.0;
      System.out.println(c);
    }
}