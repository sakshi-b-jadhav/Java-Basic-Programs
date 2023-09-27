//22.	 Infosys want’s to hire a Driver having following criteria’s.
//a.	Age must be Greater than 40.
//b.	Driving Experience Greater than 10 Years.
//c.	12th Mark’s Greater than 60.

public class HireInfosys
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
          HireInfosys HI=new HireInfosys();		  
	  
		  String returnValue=HI.criteria(30,11,70);
		  System.out.println(returnValue);
	  }
  }
  
		  
		  
		  
