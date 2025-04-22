package revision_class;
//grandparent implements should be added in parent class as well as child class
//child class should not be a abstract class bcz it is not having abstract method
//abstract cl

interface  magarpattacity
{
	void road();
}

abstract class park implements magarpattacity{
	abstract void senior(); //abstract method which is ended like ();
	static void kids() //Concrete method
	{
		System.out.println("Kids play area done");
	}
	
public void road() {
		
		System.out.println("road Done");
	}

}

public class ImplementsRelation extends park{
	
	void senior() {
		System.out.println("senior park");
		
	}

	public static void main(String[] args) {
		
		ImplementsRelation a1 = new ImplementsRelation();
		a1.road();
		a1.senior();
		kids();
	}

	
	
	
	
}
