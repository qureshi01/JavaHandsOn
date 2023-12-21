
public class thiskeyword {
	
	int a, b; //INSTANCE OR CLASS VARIABLES
	
	void getvalues(int a, int b) //METHOD VARIABLES
	/*
	 {
		a=a; 
		b=b;
	}
	*/
	
	/* HERE THIS SYNTACTICALLY CORRECT 
	 * BUT LOGICALLY INCORRECT.
	 * HERE THE CONSOLE DOESNT KNOW WHICH A IS THIS
	 * SO WE SHOULD MAKE CONSOLE KNOW WHERE DOES VARIABLE BELONGS TO.
	 */
	
	{
		this.a=a; 
		this.b=b;
	}

	void printvalues()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		thiskeyword th=new thiskeyword();
		th.getvalues(10, 10);
		th.printvalues();
	}

}
