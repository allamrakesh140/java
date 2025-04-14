import java.util.Arrays;
import java.util.Scanner;
public class array9{
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
System.out.println("Enter the key value:");
int k=sc.nextInt();
for(int j=1;j<=k;j++)
{ 
  int temp=arr[n-1];
    for(int i=n-2;i>=0;i--)
      {
          arr[i+1]=arr[i];
         }
    arr[0]=temp;
}
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+"  ");
}
}
}