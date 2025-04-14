import java.util.Arrays;
import java.util.Scanner;
public class array2{
public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
 System.out.println("Enter the array size:");

     int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the array value elements:");
       for(int i=0;i<n;i++)
       { 
          
         arr[i]=sc.nextInt();

        }
int sum=0;
System.out.println("enter the value of k:");

      int k=sc.nextInt();
       for(int j=0;j<=k;j++)
        { 
          sum=sum+arr[j];
        }
System.out.println("the total sum of the elements upto k th index is:"+sum);

}
}