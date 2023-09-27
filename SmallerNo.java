import java.util.Scanner;

public class SmallerNo
{
	public static void main(String[]args)
	{
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
  System.out.println("Accept 4 numbers");
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();
  d=sc.nextInt();
  
  if(a<=b)
  {
	
	      if(a<=c)
	      {
		      if(a<=d)
		        {
		         System.out.println("a is small");
		        }
		      else
		        {
		          System.out.println("d is small");
		        }
	       }
	    else
	        {
		  
		      if(c<=d)
			  {
		        System.out.println("c is small");
              }
		    else
		      {
			   System.out.println("d is small"); 
		      }
	      }
  }
	 
		  
 else
    {
	    if(b<=c)
	   {
	     	 if(b<=d)
		      {
		     	 System.out.println("b is small");
		      }
		    else
		      {
		      System.out.println("d is small");
		      }
	   }
		 else
	        {
				 
			          if(c<=d)
			        {
			    	   System.out.println("c is small");
			    	   
			        }
			   else
			        {
			    	   System.out.println("d is small");
			    	   
			        }
		    }
    }
 
  
}
}
			  
	 
		   
			  
  
 
  
  