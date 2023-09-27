//Create a program that takes the current hour (in 24-hour format) as input and  print a greeting message based on the time of day (morning, afternoon, evening).

public class Hour
{ 
     // int h;
	  public static String currentHour(int h)
	{

		switch(h)
		{  
		    case 1:
			case 2:
		    case 3:
		    case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:			
				   return "Good Morning" ;
					
		    case 13:
			case 14:
			case 15:
			case 16:	  
			       return "Good Afternoon";
					
			
			case 17:
			case 18:
			case 19:
			case 20:
			        return "Good Evening";
				
					
				
            case 21:
			case 22:
			case 23:
			case 24:
                    return "Good night";	
					
					default:
			return "Invalid Hour";
					
		}
	}
 
public static void main(String[]args)
{
   String returnValue=currentHour(9);
   System.out.println(returnValue);
}
}  
			
					
					
								
			      
		