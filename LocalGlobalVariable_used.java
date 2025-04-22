package revision_class;

public class LocalGlobalVariable_used {
	static int a=99; //global variable
	double g =3.13;
	
	static void vaani()
	{
		int b=a*10;
		System.out.println(b);
	}
	
	 void veda()
	{
		double d=3.14;
		int h=10;
		int a= 9;
		System.out.println(d+h+a);
	}

	public static void main(String[] args) {
		//int a=6;
		System.out.println(a);
		LocalGlobalVariable_used m1= new LocalGlobalVariable_used();
		
		System.out.println(m1.g);
		
   vaani();
   m1.veda();
   
	}

}
