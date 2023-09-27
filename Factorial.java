
import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        
            Factorial f=new Factorial();
            int factorial =f.calFac(number);
            System.out.println(factorial);
            
        
        
    
    }
    
    public int calFac(int n)
    {
    	if(n==1)
    	{
    		return 1;
    	}
    	else
    	{
    		return n*calFac(n-1);
    	}
    }
}
    	