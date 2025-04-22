package revision_class;

public class Logical_Operator {

	public static void main(String[] args) {
		
		int a= 100;
		int b = 200;
		
		//And operator
		
		/*if(a>b&&b==200) //And operator (only both true condition it will executed)
		{
			System.out.println("1");
		}
		
		System.out.println("first output");
		
		//OR operator
		
		if (a>200 || b>30) //OR operator (if both condition is true or one true and one false in that case it will execute
		{
			System.out.println("2");
		}
*/
		 //Not operator
		
		if (!(a>400 && b>20))
		{
			System.out.println("3");
		}
		
		if(!(a==10 || b==20))
		{
			System.out.println("4");
		}
	}

}
