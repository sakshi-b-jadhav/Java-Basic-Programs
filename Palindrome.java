import java.util.Scanner;
public class Palindrome
{
  
  public int  palinNo(int num)//String
  {
	   int rev=0,rem;
    //  int givenNum=num;                                                                                                                           
	        while(num>0)
	         {
	           rem=num%10;
	           rev=rev*10+rem;
	           num=num/10;
	         }
			return rev;
	
	//return (givenNum==rev)?"palindrome":"not palindrome";
		
  }
  public static void main(String[]args)
  {
	 Scanner s=new Scanner(System.in); 
	 
	 System.out.println("Enter any number");
	  int num=s.nextInt();
	 Palindrome p=new Palindrome();
	 int returnValue=p.palinNo(num);  //String
	 System.out.println(returnValue);
	 
	 
  }
}

	
	
  
  
  