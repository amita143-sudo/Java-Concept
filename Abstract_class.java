package revision_class;
//Abstract class having abstract method in it and in abstract method we does not have implementation in it
//abstract method is only non static method
//abstract class having abstract method as well as concrete method and concrete method having static and non static method
// (); it is represented end of the abstract method. no need of implementation here
abstract class vaani{
	abstract void gold();
	abstract void add1();
     abstract void sub();
     abstract void rama();
     
     void subway()
     {
    	 
     }
     
     
}

  class superparent extends vaani{
	void father()
	{
		System.out.println("son1");
	}
	
	
	static void mothar()
	{
		System.out.println("son2");
	}


	@Override
	void gold() {
		// TODO Auto-generated method stub
		
	}


	@Override
	void add1() {
		// TODO Auto-generated method stub
		
	}


	@Override
	void sub() {
		// TODO Auto-generated method stub
		
	}


	@Override
	void rama() {
		// TODO Auto-generated method stub
		
	}
	

	
}
public class Abstract_class extends superparent {
	
	 void add() {
		 System.out.println("add");
	 }
static void mul()
{
	System.out.println("mul");
}
	public static void main(String[] args) {
		
		
		Abstract_class d= new Abstract_class();
		
		d.sub();
		d.add();
		d.add1();
		d.gold();
		d.rama();
		
		
	}

	
	void add1() {
		System.out.println("add1");
		
	}

	
	void sub() {
		System.out.println("sub");
		
	}

	
	void gold() {
		System.out.println("gold");
		
	}


	void rama() {
		System.out.println("rama1");
		
	}

	

}
