import java.util.Scanner;

public class Salary
{
public static void main(String[]args)
{
	long BasicSal,HRA,TA,DA,MA,PF,GrossSal,NetSal,detuction;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Basic Salary of Employee:");
	
	BasicSal=sc.nextLong();
	
	HRA=BasicSal*45/100;
	System.out.println(HRA);
	
	TA=BasicSal*25/100;
	System.out.println(TA);
	
	DA=BasicSal*30/100;
	System.out.println(DA);
	
	GrossSal=BasicSal+HRA+TA+DA;
    System.out.println(GrossSal);
	
	MA=BasicSal*5/100;
	System.out.println(MA);
	
	PF=BasicSal*25/100;
	System.out.println(PF);
	
	
	
	detuction=MA+PF;
	System.out.println(detuction);
	
	
	NetSal=GrossSal-detuction;
	System.out.println(NetSal);
	
	
 }
}

	