package revision_class;

//developing multiple method with same name but different in argument

public class MethodOverloading {
	
	
	
	 void add()
	{
		System.out.println("1");
	}
	static void add(int a)
	{
		System.out.println(a);
	}
	static void add(boolean a, int b)
	{
		System.out.println("3");
	}
     void add(char c)
     {
    	 System.out.println("c");
     }
     void add(String s)
     {
    	 System.out.println(s);
     }
	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		m1.add("veda");
		m1.add('c');
		m1.add();
		add(2);
		add(true,30);
		
		
	}

}
