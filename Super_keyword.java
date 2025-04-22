package revision_class;

class Parent
{
	
	void voice(int a)
	{
		System.out.println(a);
	}
	
}

public class Super_keyword extends Parent {
	
	void voice(int a)
	{
		super.voice(45);
		System.out.println(a);
	}

	public static void main(String[] args) {
		Super_keyword s= new Super_keyword();
		s.voice(12);

	}

}
