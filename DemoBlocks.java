package revision_class;

//sib , iib does not have parametrised or non parametrised because it is blocks not method
// order of execution ssb, main method, iib, constructor
public class DemoBlocks {
	
	DemoBlocks()
	{
		System.out.println("this is my constructor");
	}
	
	static {
		System.out.println("this is my sib");
	}
	
	{
		System.out.println("this is my iib");
	}
	
	public static void main(String[] args) {
		System.out.println("this is my main method");
		
		new DemoBlocks();
	}

}
