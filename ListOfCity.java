import java.util.Scanner;
public class ListOfCity
{
 public static void main(String[]args)
 {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("please select one city");
	 System.out.println("mumbai,pune,nashik");
	    String city=sc.nextLine();
	
	  
	  switch(city)
	  {
		  case "mumbai":
		        System.out.println("city mumbai");
				break;
		
		  case "pune":
		       
				 System.out.println("city pune");
				   break;
				 
		  case "nashik":
		         System.out.println("city nashik");
				  break;
				 
		  default:
		          System.out.println("Invalid city");
	  }
	  
	  
	}
}
 
	  
		  
	  