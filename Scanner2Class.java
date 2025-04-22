package revision_class;

import java.util.Scanner;

public class Scanner2Class {
	
	

	public static void main(String[] args) {
		//int a,b, add, sub, mul, div;
	
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a= s1.nextInt();
		int  b=s1.nextInt();
		 
		 int add = a+b;
		 System.out.println("Addition is: " + add);
		 
		 System.out.println("Enter two numbers");
		 int e = s1.nextInt();
		 int f = s1.nextInt();
		 
		 int sub= e-f;
		 System.out.println("Substraction is: " + sub);
		 System.out.println("Enter two numbers");
		 int c = s1.nextInt();
		 int d= s1.nextInt();
		 int  mul = a*b;
		 System.out.println("multiplication is: " + mul);
		 
		 System.out.println("Enter two numbers");
		 int x = s1.nextInt();
		 int y= s1.nextInt();
		 
		int div = x%y;
		 
		 
		
		
		 System.out.println("division is: " + div);
		
	}

}
