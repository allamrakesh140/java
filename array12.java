import java.util.Arrays;
import java.util.Scanner;
public class array12{
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
int p=arr[0];
System.out.print(p+" ");
for(int i=1;i<n;i++)
{
if(arr[i]>p)
{
System.out.print(arr[i]+" ");
p=arr[i];
}
}


 }
}