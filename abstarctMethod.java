package revision_class;

abstract class kumar{
	abstract void palaash();
}

abstract class megacity extends kumar{
	abstract void gardenFacing();
		abstract void cityFcing();
		void pordium()
		{
			System.out.println("podium done");
		}
		
void palaash()
{
	System.out.println("palaash1");
}
		
		
		void water()
		{
			System.out.println("water issue");
		}
	
		static void electricity()
		{
			System.out.println("light issue");
		}
}



public class abstarctMethod extends megacity{
	
	
	void gardenFacing() {
		System.out.println("garden1403");
		
	}

	void cityFcing() {
		
		System.out.println("city1103");
	}
	
	static void clubHouse()
	{
		System.out.println("forKids");
	}
 void yoga()
 {
	 System.out.println("yogaWay");
 }
	public static void main(String[] args) {
		
		
		clubHouse();
		electricity();
		abstarctMethod a1 = new abstarctMethod();
		a1.pordium();
		a1.palaash();
		a1.cityFcing();
		a1.gardenFacing();
		a1.yoga();
		a1.clubHouse();
		a1.water();
		
	}

	
}
