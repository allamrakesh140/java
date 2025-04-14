import java.util.Arrays;
import java.util.Scanner;
public class array1{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of value:");
int n=sc.nextInt();
int arr[]=new int[n];
          for(int i=0;i<n;i++)
              {
                arr[i]=sc.nextInt();
               }
  System.out.println("Enter the value of k:");
            int k=sc.nextInt();
int sum=0;
           for(int i=0;i<n;i++)
                 {
                  if(k>arr[i])
                    {
                      sum=sum+arr[i];
                    }
                
                 }
               System.out.println("total sum of elements in an array upto key value:"+sum);
           
}
}