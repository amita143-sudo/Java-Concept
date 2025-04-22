package revision_class;

public class BlocksExecution {
	
	BlocksExecution(boolean b)
	{
		System.out.println("constructor 1");
	}
	BlocksExecution(int a, int b)
	{
		
		System.out.println("constructor 2");
	}
	static {
		System.out.println("sib 1");
	}
static {
	System.out.println("sib 2");
	}
static {
	System.out.println("sib 3");
}
{
	System.out.println("iib 1");
}
{
	System.out.println("iib 2");
}

{
	System.out.println("iib 3");
}

static void method1()
{
	System.out.println("static method 1");
}
static void method2()
{
	System.out.println("static method 2");
}

void method3()
{
	System.out.println("non static method 1");
}
void method4()
{
	System.out.println("non static method 2");
}
	public static void main(String[] args) {
		 System.out.println("main method");
		BlocksExecution b1=new BlocksExecution(true);
		BlocksExecution b2=new BlocksExecution(22,34);
		b1.method3();
		b1.method4();
		method1();
		method2();

	}

}
