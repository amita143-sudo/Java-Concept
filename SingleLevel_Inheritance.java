package revision_class;

class grandparent
{
	void money()
	{
		System.out.println("money");
	}
	
	static void gold()
	{
		System.out.println("glod");
	}
}
class parent extends grandparent
{
    static void car()
	{
		System.out.println("car");
	}
	 void house()
	{
		System.out.println("house");
	}
}
public class SingleLevel_Inheritance extends parent  {
	
	 void cycle()
	{
		System.out.println("cycle");
	}
	 void bicycle()
	{
		System.out.println("bicycle");
	}

	
	public static void main(String[] args)  {
		
		/*SingleLevel_Inheritance m1 = new SingleLevel_Inheritance();
		m1.money();
		
		m1.bicycle();
		
		gold();
		
   car();
   house();
   m1.cycle(); */
  
		/*parent p1 = new parent();
		p1.money();
		car();
		house();
		gold(); */
		
		gold();
		grandparent g = new grandparent();
		g.money();
		car();
		
	
		
   
	}
	}

