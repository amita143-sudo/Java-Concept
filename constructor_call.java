package revision_class;
/* 1. constructor is a special method in java which does not have return type
 * 2. It is always be a non static method
 * 3. constructor name should be same as class name
 * 4. constructor do have access specifier
 * 5. when we create object constructor automatically call
 */
public class constructor_call {
	
	static void mirror1()
	{
		System.out.println("1");
	}
	
	static void mirror2()
	{
		System.out.println("2");
	}
	
	static void mirror3()
	{
		System.out.println("3");
	}
	
	void error1()
	{
		System.out.println("4");
	}
	void error2()
	{
		System.out.println("5");
	}
	void error3()
	{
		System.out.println("6");
	}
	public constructor_call()
	{
		System.out.println("constuctor executed");
	}

	
	public static void main(String[] args) {
		constructor_call m1 = new constructor_call();
		
		m1.error1();
		m1.error2();
		m1.error3();
		
		mirror1();
		mirror2();
		mirror3();
		constructor_call m2= new constructor_call();
		
		
	}

}
