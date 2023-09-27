import java.util.Scanner;

public class LeapYearChecker
 {
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        boolean isLeapYear = false;
        
        switch (year % 400)
		{
            case 0:
                isLeapYear = true;
                break;
            default:
                switch (year % 100)
				{
                    case 0:
                        isLeapYear = false;
                        break;
                    default:
                        switch (year % 4)
						{
                            case 0:
                                isLeapYear = true;
                                break;
                        }
                }
        }
        
        if (isLeapYear)
			{
            System.out.println(year + " is a leap year.");
            } 
		 else 
			
		   {
            System.out.println(year + " is not a leap year.");
           }
    }
}