
public class ConstructorDemo {
	
	int x;
	int y;
	
	ConstructorDemo() //DEFAULT CONSTRUCTOR
	{
		x=10;
		y=20;
	}

	ConstructorDemo(int a, int b) //PARAMETERIZED CONSTRUCTOR
	{
		x=a;
		y=b;
	}
	
	
	void display()
	{
		System.out.println(x+y);
	}
	public static void main(String[] args) {

		ConstructorDemo cm1= new ConstructorDemo();
		cm1.display();
		
		ConstructorDemo cm2=new ConstructorDemo(100,200);
		cm2.display();
				
	}

}
