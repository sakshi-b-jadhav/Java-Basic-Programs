import java.util.Scanner;

public class Swap
{
public static void main(String[]args)
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the value of a and b");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("value before swaping\n a:"+a+"\n b:"+b);
	c=a;
	a=b;
	b=c;
	
	System.out.println("value after swaping \n a:"+a+"\n b:"+b);
	
}
}

  
 
