import java.util.Arrays;
import java.util.Scanner;
public class array6{
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
     System.out.println("Enter the k  value:");
  int k=sc.nextInt();
           for(int i=0;i<n;i++)
             {
                for(int j=i+1;j<n;j++)
                 {
                     if(arr[i]+arr[j]==k)
                      {
                       System.out.println("indexes are:"+ i+" "+j);
System.out.println(arr[i]+" "+arr[j]);
                      }
                 }
              }
}
}