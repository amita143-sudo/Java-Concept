package revision_class;

public class Incremental_forLoop {

	public static void main(String[] args) {
		
		/*for(int i =10; i>-8; i++) //any value greater than -8 so it executed infinite time
		{
			System.out.println("hello");
		}
*/
		for(int i =0; i<=100; i++)
			if(i%2!=0) //if(i%2==0) condition for even number
		{
			System.out.println(i);
		}
	}

}
