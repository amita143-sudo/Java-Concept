package revision_class;
//override only non static method
//here we have only child class implementation bcz it overide over parent class
// super keyword is used in method overriding to execute all child class implementation


 class bike{
	 void house(int a)
	{
		System.out.println("boy is talking");
	}
}


class Home extends bike{
	
	 void house(int a)
	{
		//super.house(a);
		System.out.println("man is talking");
	}
	
}

public class MethodOverriding extends Home {
	
	void house(int a)
	{
		//super.house(a);
		System.out.println("women is talking");
	}

	public static void main(String[] args) {
		
		MethodOverriding m1 = new MethodOverriding();
		m1.house(12);
		
	}

}
