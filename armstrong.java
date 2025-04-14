
import java.util.Scanner;
public class armstrong{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int arm=0;
int digits=0;
int temp=num;


  while(temp>0)
   {     
   temp = temp/10;
   digits++;
   }
temp=num;
     while(temp>0)
      {
       int rem=temp % 10;
       int arm=arm+ (int) math.pow(rem,digits);
       temp=temp/10;
       }
    if(num==arm)
    {
    System.out.println("Given number is an Armstrong number");

    }
   else
   {
    System.out.println("Given number is not an Armstrong number");
   }

 }
}