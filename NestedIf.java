package revision_class;

public class NestedIf {

	public static void main(String[] args) {
		int m=100;
		int n=90;
		
		
		if (m>90) // if this condition is true it goes to the next if block 
		{
			if(m==100)
				
		{
			
		
			if(n>m)
			{
				System.out.println("hi");
			}
			else {
				System.out.println("hii");
			}
		}
			    
			else
			        {
				System.out.println("hiii");
			        }
		}
		else
		{
			System.out.println("main");
		}
	}

}
