import java.util.Arrays;
import java.util.Scanner;
public class array13{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of an array:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.print("Enter the elements in an array:"+" ");

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
  int count=0;

  for(int j=1;j<n;j++)
  {
   if(arr[i]==arr[j])
   {
   count++;
   }
   
if(count==1)
{
System.out.print(arr[i]);

}
  }
}

 }
}