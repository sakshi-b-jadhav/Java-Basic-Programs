public class SwitchCase1
{
  public static String switchCase(int a)
  {
	  
	  
	  int leap=a%4;
	  switch(leap)
	 
	  {
	  
	  case 0: 

		int validLeap=leap%100;
		System.out.println(validLeap);
	 
		switch(validLeap)
		{
		
			case 0:
				return "divided by 100";
		         
		   
			default:
				return "not divided by 100";
		      
	    }
	  
	   
	    default:
		   
		   return "Invalid year";
  }
}
		   
		   public static void main(String[]args)
		   {
			 String returnValue=switchCase(2000);
			   System.out.println(returnValue);
		   }
		   
}

		   
		   
		   
		 
		 
		 
		
	      
	  
     
    
  
	