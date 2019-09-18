import java.util.*;
public class q1
{
     public static void main(String[] args) 
     {
        Scanner sc =new Scanner(System.in);
        long val1=sc.nextLong();
        
        /*  for negative nos */
        if(val1 < 0)
        {
            val1*=-1;
        }

        /*  palindrome or not */
        long rem,val2=val1;
        long val3=0;
        while(val2 > 0)
        {
            rem=val2%10;
            val2/=10;
            val3=val3*10+rem;
        }
        if(val3 == val1)
        {
            System.out.print(val1 +" is  palindrome and the sum of  even no is");

            /*  Add even no values */
            
            long sum=0;
            while(val1 >0)
            {
                rem=val1%10;
                if(rem%2==0)
                sum+=rem;
                val1=val1/10;
            }

            if( sum >25)
            {
                System.out.println(" greater than 25");
            }
        

            else
            {
                System.out.println(" less than 25");
            }
        }
        
        else
        {
            System.out.println(val1+ " is not palindrome");
        } 
        
    }
}