package prac_prg;
public class Duplicate_prg
{   
    public static void main(String[] args) 
    {
        String[] flowerArr = {"Rose","Daisy","Sun flower","Jasmine","Rose","Mary gold"};
  
        for (int i = 0; i < flowerArr.length-1; i++)
        {
            for (int j = i+1; j < flowerArr.length; j++)
            {
                if( (flowerArr[i].equals(flowerArr[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+flowerArr[j]);
                }
            }
        }
    }    
}