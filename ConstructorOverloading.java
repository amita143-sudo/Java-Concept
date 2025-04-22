package revision_class;
//developing multiple constructor with different argument (parameter , datatype is different

public class ConstructorOverloading {
	
	ConstructorOverloading(String s)
	
	{
		System.out.println(s);
	}
	
	ConstructorOverloading(boolean b,int a)
	{
		System.out.println("boolean value");
	}
	ConstructorOverloading(int a, int b, double c)
	{
		System.out.println("int and double");
	}
	ConstructorOverloading(char c, String s)
	{
		System.out.println("char and string");
	}
	
	public static void main(String[] args) {
		ConstructorOverloading m1= new ConstructorOverloading("Vaani");
	     new ConstructorOverloading(false,56);
		 new ConstructorOverloading(12,45,3.14);
		 new ConstructorOverloading('A',"Vaani");
		
		
	}

}
