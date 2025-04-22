package revision_class;

public class if_Else {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		int c= 50;
		
		if (a>b) //condition if it is not true else block is executed
		{
			System.out.println("hello"); 
		}
		else if(c>b)  //if first condition is true that is answer whatever other condition
			//will be true or false only first true condition is executed
		{
			System.out.println("hi");
		}
		else if (c==b)
		{
			System.out.println("hiii");
		}
		else
		{
			System.out.println("bye");
		}
	}

}
