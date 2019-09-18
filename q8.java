import java.util.*;
public class q8
{
     public static void main(String[] args) 
     {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter no between 1 to 50");
        
        // generate random number
        Random rand= new Random();
        int target=rand.nextInt(50);
        target+=1;
        
        while(true)
        {
            int n=sc.nextInt();
            if(n==target){
                System.out.println("Number guessed matches the original number");
                break;
            }
            else if( n < target)
            {
                System.out.println("Number  guessed is less than original number");
            }
            else
            {
                System.out.println("Number  guessed is more than original number");
            }
        }
        System.out.println("Target/original No was: "+ target);
            
    }
}