
public class ConstructorOverloading {
	
	ConstructorOverloading(int a, int b) //1
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloading(double a, int b) //2
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloading(int a, double b) //3
	{
		System.out.println(a+b);
	}

	ConstructorOverloading(double a, double b) //4
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloading(int a, int b, int c, int d) //5
	{
		System.out.println(a+b+c+d);
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading co=new ConstructorOverloading(10, 20); //1
		ConstructorOverloading co1=new ConstructorOverloading(10.5, 20); //2
		ConstructorOverloading co2=new ConstructorOverloading(10, 20.5); //3
		ConstructorOverloading co3=new ConstructorOverloading(10.5, 20.5); //4
		ConstructorOverloading co4=new ConstructorOverloading(10, 20, 30, 40); //5


	}

}
