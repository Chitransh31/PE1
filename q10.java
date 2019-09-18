import java.util.*;
public class q10
{
     public static void main(String[] args) 
     {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        int n =sc.nextInt();
       // System.out.println(str +" "+ n);
        String str2=str.substring(str.length()-n);  // here  we enter  intial index
        //System.out.println(str2);
        for(int i=0;i<n;i++)
        {
            str=str+str2;
        }
        System.out.println(str);   
        
    }
}