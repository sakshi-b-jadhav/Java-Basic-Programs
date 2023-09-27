import java.util.Scanner;

 public class SimpleInterest
 {
  public static void main(String[]args)
  {
	  double LoanAmt,InterestAmount,TotalAmount;
	  
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the Loan amount:");
	  LoanAmt=sc.nextDouble();
	 
	  InterestAmount=LoanAmt*12/100;
	  System.out.println(InterestAmount);
	  
	  TotalAmount=LoanAmt+InterestAmount;
	  System.out.println(TotalAmount);
  }
 }
 
	  
	  
	  
	  
	  
	  
	  
	 
	  