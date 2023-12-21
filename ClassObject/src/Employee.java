
public class Employee {
	
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display()
	{
		System.out.println("Employee ID :"+eid);
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee Salary :"+sal);
		System.out.println("Employee Deptno :"+deptno);
		System.out.println("Employee Job :"+job);

	}
	void bonus()
	{
		double bonus = ((sal*10)+10000);
		System.out.println("Bonus is : "+bonus);
	}
	
}
