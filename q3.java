import java.util.*;
public class q3
{
     public static void main(String[] args) 
     {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();

       // System.out.println(str.length());

       /* check Error */
       
        int flag=0;
       for(int i=0;i<str.length();i++)
        {
            if( Character.isLetter( str.charAt(i)))
            {
                continue;
            }
            else
            {
                flag=1;
                System.out.println( "Error / Enter only character");
                break;
                
            }
        }
        
        if(flag==0)
        {
            for(int i=0;i<str.length();i++)
            {
                    System.out.print(str.charAt(i));
                    /*  check consonant and vowel*/
                    if(str.charAt(i) =='a'|| str.charAt(i) =='e'|| str.charAt(i) =='i'|| str.charAt(i) =='o'||str.charAt(i) =='u'|| 
                    str.charAt(i) =='A'||str.charAt(i) =='E'|| str.charAt(i) =='I'|| str.charAt(i) =='O'|| str.charAt(i) =='U')
                    {
                        System.out.println(" -vowel");
                    } 
                    else
                    {
                        System.out.println(" -consonant");
                    }
            
            }
        }
    
    }
}