
public class MethodOverloading {
	
	void add(int a, int b) //1
	{
		System.out.println(a+b);
	}
	
	void add(int a, double b) //2
	{
		System.out.println(a+b);
	}
	
	void add(double a, int b) //3
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c, int d) //4
	{
		System.out.println(a+b+c+d);
	}
	
	void multiply(int a, int b)  //5
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		
		MethodOverloading mo=new MethodOverloading();
		
		mo.add(10,20); //1
		mo.add(10.5,20); //3
		mo.add(20, 13.50); //2
		mo.add(5, 40, 30, 10); //4
		mo.multiply(10, 10); //5
	}

}
