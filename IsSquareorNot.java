package prac_prg;//check
import java.util.*;
public class IsSquareorNot
{
    static class Point  
{ 
    int x, y; 
  
        public Point(int x, int y)  
        { 
            this.x = x; 
            this.y = y; 
        } 
      
}; 
static int distSq(Point p, Point q) 
{ 
    return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y); 
} 
 static boolean isSquare(Point p1, Point p2, Point p3, Point p4) 
{ 
    int d2 = distSq(p1, p2); 
    int d3 = distSq(p1, p3); 
    int d4 = distSq(p1, p4); 
  
    if (d2 == 0 || d3 == 0 || d4 == 0)     
        return false; 
   
    if (d2 == d3 && 2 * d2 == d4 
        && 2 * distSq(p2, p4) == distSq(p2, p3)) 
    { 
        return true; 
    } 
  
    if (d3 == d4 && 2 * d3 == d2 
        && 2 * distSq(p3, p2) == distSq(p3, p4))  
    { 
        return true; 
    } 
    if (d2 == d4 && 2 * d2 == d3 
        && 2 * distSq(p2, p3) == distSq(p2, p4)) 
    { 
        return true; 
    } 
  
    return false; 
} 

public static void main(String[] args) 
{ 
  	int px1,py1,px2,py2,px3,py3,px4,py4;
  	Scanner sc=new Scanner(System.in);
  	px1=sc.nextInt();
  	py1=sc.nextInt();
  	px2=sc.nextInt();
  	py2=sc.nextInt();
  	px3=sc.nextInt();
  	py3=sc.nextInt();
  	px4=sc.nextInt();
  	py4=sc.nextInt();
  	Point p1 = new Point(px1,py1), p2 = new Point( px2,py2), 
        p3 = new Point(px3,py3), p4 = new Point( px4,py4); 
    System.out.println(isSquare(p1, p2, p3, p4)==true ? "Yes" : "No"); 
} 
}