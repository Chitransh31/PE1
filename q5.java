import java.util.*;
import java.lang.*;
public class q5
{
     public static void main(String[] args) 
     {
        Scanner sc =new Scanner(System.in);
        int sum=0;
        int val=0;
        
       for(int i=0;i<args.length;i++)
       {

           if(isInteger(args[i]))
           {
               sum+=Integer.parseInt(args[i]);
           }
           else
           {
              System.err.println("not integer/ Error");
              val=1;
              break;
            
           }

       }
       if(val ==0)
       System.out.println(sum);
      /*  while(true)
        {
        
        
          if(sc.hasNextInt())
        {
             sum+=sc.nextInt();
        }
        else
        {
            //System.err.println("Not  integer");
            break;
        }

       }*/

    }

     /*   Method to check given string is integer or not */  
    public static boolean isInteger(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            continue;
            else if(s.charAt(i)=='-')
            continue;
            else
            return (false);
        }
        return true;
    }
}