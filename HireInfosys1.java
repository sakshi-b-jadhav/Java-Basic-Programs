public class HireInfosys1
{ 
	  public  String criteria(int age,int driveExp,int marks)
	  {
		  
		  
				
			 
		  if(age>=40&&driveExp>=10&&marks>=60)
		  
         	  return "Employee is eligible";
		  else
		  
			  return "Employee is not eligible";
		  
		  
	  }
	  public static void main(String[]args)
	  {
          HireInfosys1 HI=new HireInfosys1();		  
	  
		  String returnValue=HI.criteria(30,11,70);
		  System.out.println(returnValue);
	  }
  }
  
		  
		  
		  