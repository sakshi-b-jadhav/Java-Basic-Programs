import java.util.Scanner;

public class BillAmount
{
public static void main(String[]args)
{
    float BillAmt,GSTAmt,NetAmt;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the bill amount");
	BillAmt=sc.nextFloat();
	
	GSTAmt=BillAmt*18/100;
	System.out.println(GSTAmt);
	
	NetAmt=BillAmt+GSTAmt;
	System.out.println(NetAmt);
	
 }
}

	
	
  