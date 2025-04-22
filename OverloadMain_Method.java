package revision_class;
//can we overload main method -yes we can

public class OverloadMain_Method {
	
	void main(int a)
	{
		System.out.println(a);
	}
	
	static void main(char c)
	{
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		main('A');
		OverloadMain_Method m1 = new OverloadMain_Method();
		m1.main(12);
	}

}
