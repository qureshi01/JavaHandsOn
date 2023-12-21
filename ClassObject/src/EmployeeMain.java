
public class EmployeeMain {
	public static void main(String args[])
	{
		
//Assign values by using reference		
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="Hashim";
		emp1.sal=100000.00;
		emp1.deptno=10;
		emp1.job="Full Stack";
		emp1.display();
		emp1.bonus();
		
		
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="Qureshi";
		emp2.sal=120000.00;
		emp2.deptno=15;
		emp2.job="FrontEnd";
		emp2.display();
		emp2.bonus();

		
	}

}
