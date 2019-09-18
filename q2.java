import java.util.*;
public class q2
{
     public static void main(String[] args) 
     {
        Scanner sc =new Scanner(System.in);
        int val1=sc.nextInt();

        if( val1 >=20 &&  val1 <=30)
        {
            System.out.print(val1 );
            if( val1%2==0)
            {
                System.out.println(":- Jerry");
            }
            else
            {
                System.out.println(":- Tom");
            }
        }
        else
        {
            System.out.println(val1+ " does not exist between 20 and 30");
        }
        
    }
}