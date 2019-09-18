import java.util.*;
public class q6
{
     public static void main(String[] args) 
     {
        Scanner sc =new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
       if(Character.isDigit(ch))
       {
           System.out.println("Given char is digit");
       }

      else if(Character.isUpperCase(ch))
       {
           System.out.println("Capital Letter");
       }

      else if(Character.isLowerCase(ch))
       {
           System.out.println("small letter");
       }  
      else
       System.out.println("Special character");    
    }
}