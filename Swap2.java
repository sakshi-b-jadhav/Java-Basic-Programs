import java.util.Scanner;

public class Swap2
{
public static void main(String[]args)
{
	 int a,b;
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the values of a and b");
	 
	 a=sc.nextInt();
	 b=sc.nextInt();
	 
	 
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 
	 System.out.println("value after swaping of\n a:"+a+"\n b:"+b);
}
}

      	  
	 