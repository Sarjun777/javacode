package basicprogram;

public class Constructorexample {
	
	
	Constructorexample()
	{
		System.out.println("Helloo");
	}
	
	Constructorexample(int a)
	{
		System.out.println("Hi");
	}
	
	Constructorexample(char a,int b)
	{
		System.out.println("Sarjun");
	}
	Constructorexample(String a,int b)
	{
		System.out.println("Bye");
	}
	Constructorexample(float a)
	{
		System.out.println("sar");
	}
	Constructorexample(boolean a)
	{
		System.out.println("jun");
	}

	public static void main(String[] args) {
		
		
		Constructorexample c1=new Constructorexample();
		new Constructorexample();
		new Constructorexample(234);
		new Constructorexample('s',89321);
		new Constructorexample("Sar",12);
		Constructorexample c2=new Constructorexample(23.4f);
		Constructorexample c3=new Constructorexample(false);

	}

}  
