import java.util.Arrays;
import java.util.Scanner;
public class array4{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of an array:") ;
int n=sc.nextInt();
int arr[]=new int[n];
  for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();
   }

  int max=arr[0];int min=arr[0];
   for(int i=1;i<n;i++)
     {
      if(max<arr[i])
     {
      max=arr[i]; 
      }
    if(min>arr[i])
    {
      min=arr[i];
     }
     }
    System.out.println("maximum element in an array:"+max);
System.out.println("minimum element in an array:"+min);

 
}
}