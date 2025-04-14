import java.util.Arrays;
import java.util.Scanner;
public class array8{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of an array:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements in an array:");

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}

     for(int i=1;i>0;i++)
      {
Boolean b=false;
        for(int j=0;j<n;j++)
          {
           if(i==arr[j])
               {
                b=true;
               }
          }
              if(b==false)
                {
                     System.out.println("Missing element in an array is :"+i);
                 break;    
                }
           
       }

}
}