package revision_class;

public class SwitchCaseProgram1 {

	public static void main(String[] args) {
		
		int num=11;
		String  size;
		switch(num)
		{
		case 10:
			size = "small";
			break;
		case 11:
			size="medium";
			break;
		case 12: 
			size ="large";
			break;
		case 13:
			size="XL";
			break;
		case 14:
			size="XXL";
			break;
		default:
		
			size="no size available";
			//System.out.println("no size available");
			break;
		}
			System.out.println("Available size is: " + size);
		
		}
	}
	
	
