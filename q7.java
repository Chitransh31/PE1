import java.util.*;

public class q7
{
    // jar: collection of classes

     public static void main(String[] args) 
     {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        /*  for negative nos*/
        if  (n < 0)
        {
            n=n*(-1);
        }
        
        /* for zero */
        if(n==0)
        {
            System.out.println("Sorted number in non desreasing order: "+0); 
            System.out.println("Sum of  even numbers: "+ 0); 
            System.out.println("FAlse");
        }

        else
        {

            int val=n;
            int count=0;
            while(val>0)
            {
                val=val/10;
                count++;
            }

            int arr[]=new int[count];
            int j,i=0;
            while(n>0)
            {
                arr[i++]=n%10;
                n=n/10;
            }
            
            /*  sort array  using bubble sort */
            for(i=0;i<count;i++)
            {
                for(j=0;j<count-1;j++)
                {
                    if(arr[j] < arr[j+1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }

            System.out.print("Sorted number in non decreasing order: ");
            for(int var:arr)
            System.out.print(var);

            System.out.println("");
            int sum=0;
            for(i=0;i<count;i++)
            {
                if(arr[i]%2==0)
                {
                    sum+=arr[i];
                }
            }

            System.out.println("Sum of  even numbers: "+ sum);

            if(sum >15)
            {
                 System.out.println("True");
            }
            else
            {
                 System.out.println("False");
            }
       }
        
    }
}