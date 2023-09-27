public class Vehical extends VehicalInfo
{
  String name;
  int vehicalNo;
  String color;
  
  public Vehical()
  {
  
  }
  public Vehical(int vehicalNo,String name)
  {
	  this(5,"abs","red"); 
	 //super(10,20);
     this.name=name;
     this.vehicalNo=vehicalNo;
  }
  
  public Vehical(int vehicalNo,String name,String color)
  {   
     this.name=name;
     this.vehicalNo=vehicalNo;
     this.color=color;
	 System.out.println(name);
	System.out.println(vehicalNo);
	System.out.println(color);
  }
  
   public static void main(String[]args)
     {
		Vehical v=new Vehical();
		 System.out.println(v.name);
		 System.out.println(v.vehicalNo);
		 System.out.println(v.color);
		
		Vehical v2=new Vehical();
		 v2.name="honda";
		 v2.vehicalNo=3434;
		 v2.color="black";
		 
		 System.out.println(v2.name);
		 System.out.println(v2.vehicalNo);
		 System.out.println(v2.color);
		 
		 Vehical v3=new Vehical(4,"splender");
		 System.out.println(v3.name);
		 System.out.println(v3.vehicalNo); 
		 System.out.println(v3.id);
		 System.out.println(v3.price);
		 
     }
}
  
    
	
  
  
   
     
	 
	 
	 
	 
	 
	 





