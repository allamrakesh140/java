import java.util.Arrays;
import java.util.Scanner;
public class array5{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array size:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the array elements:");

     for(int i=0;i<n;i++)
     {
      arr[i]=sc.nextInt();
     }
int max1=arr[0];
int max2=arr[0];
         for(int i=0;i<n;i++)
         {
           if(max1<arr[i])
             { 
               max2=max1;
                max1=arr[i];
              }
            else if(max2<arr[i])
             {
              max2=arr[i];
             
             }
          }
System.out.println("max1 element in an array is:"+max1);
System.out.println("max2 element in an array is:"+max2);


}
}