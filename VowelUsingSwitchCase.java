package revision_class;
//find vowels using switch case is possible by using scanner class
import java.util.Scanner;

public class VowelUsingSwitchCase {

	public static void main(String[] args) {
		 Scanner s1= new Scanner(System.in);
		 System.out.println("Enter the character");
		 
		 char c1 = s1.next().charAt(0);
		 switch(c1)
		 {
		 case 'a' :
		 case 'e':
		 case 'i':
		 case 'o':
		 case 'u':
			 
			 System.out.println("character " + c1 + " is a vowel");
			 break;
			 default:
				 System.out.println("character is a consonent");
		 break;
		 }
		 
		 
		 

	}

}
