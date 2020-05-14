package prac_prg;
import java.util.Arrays;
public class EqualorNot
{
    public static void main(String[] args)
    {    
        String[] firstArr = {"Rose","Daisy","Mary gold","Sun flower","Jasmine","Lily"};
          
        String[] secArr =  {"Rose","Daisy","Mary gold","Sun flower","Jasmine","Lily"};
          
        boolean result = true;
          
        if(firstArr.length == firstArr.length)
        {
            for (int i = 0; i < firstArr.length; i++)
            {
                if(firstArr[i] != firstArr[i])
                {
                    result = false;
                }
            }
        }
        else
        {
            result = false;
        }
          
        System.out.println("First Array : "+Arrays.toString(firstArr));
         
        System.out.println("Second Array : "+Arrays.toString(secArr));
         
        if (result)
        {
            System.out.println("Arrays Are Equal");
        }
        else
        {
            System.out.println("Arrays Are Not equal");
        }
    }
}