public class childConsChaining extends parentConsChaining
{
	String surname;
	
	public childConsChaining()
	{
		super(28, 150, "Sanjana");
		this.surname= surname;
	}
	
	public childConsChaining(int age, int height, String name, String surname)
	{
		//super(28, 150, "Sanjana");
		this.age=age;
		this.height=height;
		this.name=name;
		this.surname=surname;
	}
}