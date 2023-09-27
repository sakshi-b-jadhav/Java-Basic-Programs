import java.util.Scanner;
public class Circle
{

public static void main(String[]args)
{
	float radius,area,cicumference;
	float PI=3.14f;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the radius of the circle");
	radius=sc.nextFloat();
	
	area=PI*radius*radius;
	System.out.println(area);
	
	cicumference=2*PI*radius;
	System.out.println(cicumference);
	
}
}
	
  