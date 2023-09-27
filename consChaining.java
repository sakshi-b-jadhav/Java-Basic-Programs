public class consChaining
{
	public static void main(String args[])
	{
		childConsChaining c = new childConsChaining(28,150,"ABC","XYZ");
		/*c.age= 28;
		c.height=150;
		c.name="ABC";
		c.surname="XYZ";*/

		System.out.println(c.age);
		System.out.println(c.height);
		System.out.println(c.name);
		System.out.println(c.surname);
	}
}