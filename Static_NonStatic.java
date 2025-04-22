package revision_class;

public class Static_NonStatic {
	static void add()
	{
		System.out.println("1");
	}
	
	
	void mul()
	{
		System.out.println("3");
	}
	
	void sub()
	{
		System.out.println("2");
	}
	static void div()
	{
		System.out.println("5");
	}
	public static void main(String[] args) {
		
		
div();
		add();
		Static_NonStatic m1 = new Static_NonStatic();
		m1.sub();
		m1.mul();
		
	}

}
