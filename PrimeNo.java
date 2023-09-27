import java.util.Scanner;

class PrimeNo
{
 public static void main(String[]args)
 {
	int a=3,temp=0;
	
	for(int i=2;i<=a-1;i++)
		
		{
			if(a%i==0)
				{
					temp=temp+1;
		        }
		} 
 
 if(temp==0)
  {
	 System.out.println("Prime No");
  }
 else
  {
	 System.out.println("Not Prime No");
  }
 }
}
