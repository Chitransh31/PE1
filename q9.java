import java.util.*;
public class q9
{
     public static void main(String[] args) 
     {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        
        char arr[]=str.toCharArray();

        // reverse given array
        int i,j;
        char temp;
        for( i=0, j=arr.length-1;i<j;i++,j--)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
        }

        System.out.println("**** reverse string *****");
        for(i=0;i<arr.length;i++)
        System.out.print(arr[i]);

        System.out.println();

        /*  reverse with the help of string*/
        String rev="";
        for(i=str.length()-1; i>=0;i--)
        {
            temp=str.charAt(i);
            rev+=temp;
        }
        System.out.println(rev);    
    }
}