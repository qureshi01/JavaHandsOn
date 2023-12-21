
public class JavaMethods {
	
	int x=10;
	int y=20;
	
	/*void sum() //CASE1 - NOT TAKING PARAMETERS AND NOT RETURNING VALUE
	{
		System.out.println(x+y);
	}*/
	
	/*int sum() //CASE2- NOT TAKING PARAMETERS BUT RETURNING VALUE
	{
		return(x+y);
	}*/
	
	/*void sum(int a, int b) //CASE3- TAKING PARAMETERS BUT NOT RETURNING VALUE
	{
		System.out.println(a+b);
	}*/
	
	int sum (int a, int b) //CASE4- TAKING PARAMETERS AND RETURNING VALUE
	{
		return(a+b);
	}
	
	//SINCE IT IS RETURNING A VALUE IT SHOULD NOT BE VOID.
	//IT SHOULD BE SOME DATATYPE WHICH STORES DATA
	
	public static void main(String[] args) {
		
		JavaMethods cal=new JavaMethods();
		
		
		//cal.sum(); //CASE1
		
		//System.out.println(cal.sum()); //CASE2
		
		//cal.sum(100, 200); //CASE3
		
		System.out.println(cal.sum(100, 200)); //CASE4
		
		

	}

}
