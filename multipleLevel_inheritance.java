package revision_class;

//multiple level of inheritance can not be achieve in java using class with extends but using interface class
//we can achieve it . bcz using class it leads to diamond problem
interface mother{
	
	 void eye();
	
	 void cheen();
	
}

interface father {
	
	void nose();
	
	void hand();
	
}
interface stepFather{
	void home();
	void glod();
}

public class multipleLevel_inheritance implements mother, father, stepFather
{

	public static void main(String[] args) {
		multipleLevel_inheritance m1 = new multipleLevel_inheritance();
		m1.glod();
		m1.home();
		m1.cheen();
		m1.eye();
		m1.hand();
		m1.nose();
		
	}

	@Override
	public void hand() {
		System.out.println("hand is even");
		
	}

	@Override
	public void nose() {
		
		System.out.println("nose is same");
		
		
	}

	@Override
	public void eye() {
		
		System.out.println("eye are smoky");
	}

	@Override
	public void cheen() {
		System.out.println("cheen having khadi");
	}

	@Override
	public void home() {
		System.out.println("home on wheels");
		
	}

	@Override
	public void glod() {
		
		System.out.println("glod chain");
	}
}



