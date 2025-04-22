package revision_class;

import java.util.InputMismatchException;

public class tryCatch_Exception {

	public static void main(String[] args) {
		int a =10;
		int b= 2;
		int d1=30;
		System.out.println(d1);
		try{int c= a/b;
		
			System.out.println(c);
		}
				
		catch(ArithmeticException d)
		{
			System.out.println("hello");
		}

		catch(InputMismatchException e)
		{
			System.out.println("Exception e handling");
		}
		catch(Exception f)
		{
			System.out.println("Exception f handling");
		}
	}

}
