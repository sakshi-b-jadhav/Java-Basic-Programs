class NestedSwitch
{
	public static void main(String args[]){
	
		int i = 1;
		char ch = 'a';
		
		
		switch(i){
				case 1:
						switch(ch){
							case 'a': 
							System.out.println("Hello");
						}
		}
	}
}