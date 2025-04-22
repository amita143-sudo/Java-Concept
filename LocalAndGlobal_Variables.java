package revision_class;

public class LocalAndGlobal_Variables {
	static int w;
	static double pi;
	static char c;
	static String s;
	static float f;
	static boolean h;
	 static int d=89; //global value
	 double g=3.14;
	void vaani()
	{
	
	int a=12; //local variable
	
	}

	public static void main(String[] args) {
		
		LocalAndGlobal_Variables m1=new LocalAndGlobal_Variables();
		int b; //local variable
		b=23;
		//d=89;  //it will print updated value
		System.out.println(m1.g);
		System.out.println(d);
		System.out.println(w);
		System.out.println(pi);
		//System.out.println(c); no default value for char
		System.out.println(s);
		System.out.println(f);
		System.out.println(h);
	}

}
