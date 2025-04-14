import java.util.Arrays;
import java.util.Scanner;
public class array11{
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
System.out.println("Enter the k value:");
int k=sc.nextInt();
int s=0,e=n-1;
while(s<=e)
{
int mid=(s+e)/2;
if(arr[mid]==k)
{
System.out.println("element found");
break;
}
else if(arr[mid]>k)
{
e=mid-1;
}
else
{
s=mid+1;
}

}
if(s>e)
{
System.out.println("Element not found:");
}



 }
}