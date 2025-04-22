package revision_class;
//anything which is predefined is not available in package

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		//system.in means it is trying to except human input
		
		Scanner s1= new Scanner(System.in); //predefined class in java
		
		//s1.next();
		System.out.println("Enter the value of a" );
		double a =s1.nextInt();
		System.out.println("Enter the value of b" );
		double b = s1.nextInt();
		double c= a+b;    
		System.out.println("output is : " +c);
		s1.close();
	/*	s1.nextByte();
		s1.nextFloat();
		s1.nextDouble();
		s1.nextShort();
		s1.nextLong();
		s1.nextBoolean(); */
		

	}

}
