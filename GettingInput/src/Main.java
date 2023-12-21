import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		sc.nextLine();
		// We should give a sc.nextline to read string after integer or else the code will execute without getting string value
		System.out.println("Enter your name :");
		String b = sc.nextLine();
		System.out.println("Number is :"+a);
		System.out.println("Name is :"+b);
	}

}
