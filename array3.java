import java.util.Arrays;
import java.util.Scanner;
public class array3{
/*public static Boolean isPrime(int num)
{
int fc=0;
for(int i=2;i<=num;i++)
    {
      if(num%i==0)
       { 
        fc++;
        }
    
    }
    return fc==1; 

 }*/


public static int primecount(num)
{
}
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int n=sc.nextInt();
int arr[]=new int[n];
  for (int i=0;i<n;i++)
  {
  arr[i]=sc.nextInt();
   }
System.out.println("prime numbers in an array:");
     for(int num:arr)
   { 
    if(isPrime(num))
     {
    System.out.print(num+" ");
      }
   }
System.out.println();
     
}
}