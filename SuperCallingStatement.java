package revision_class;
 

//super calling statement is immediately call parent class constructor
//it is 2 types parameterized and non parameterized (implicitly and explicitly)
class parent0{
	parent0(boolean a,int b, double c)
	{
		System.out.println("0");
	}
}
class parent1 extends parent0
{
	parent1(int a)
	{ //present implicitly (invisible)
		super(false, 10,12.6);
		System.out.println("1");
	}
	
}
class parent2 extends parent1
{
	parent2()
	{               
		super(12); // Whether it is written or not no problem present explicitly
		System.out.println("2");
	}
	
}
public class SuperCallingStatement extends parent {

	public static void main(String[] args) {
		new parent2();
		
	}

}
