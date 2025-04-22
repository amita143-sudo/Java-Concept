package revision_class;

//we can create a relation between 

interface magnacity{
	void solapur();
	void nagpur();
}

public class InterfaceClass implements magnacity {
	
	void clubHouse() {
		System.out.println("clubhouse ready");
	}
	static void park()
	{
		System.out.println("park ready");
	}
	

	public static void main(String[] args) {
		
		InterfaceClass a1 = new InterfaceClass();
		a1.nagpur();
		a1.solapur();
		park();
		a1.clubHouse();
		
	}

	
	public void solapur() {
		System.out.println("water");
		
	}

	
	public void nagpur() {
		
		System.out.println("light");
		
		
	}

}
