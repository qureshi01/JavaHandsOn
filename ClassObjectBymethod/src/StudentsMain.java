
public class StudentsMain {

	public static void main(String[] args) {
		Student stu1=new Student();
		Student stu2=new Student();
		Student stu3=new Student();
		Student stu4=new Student();
		  
//Assign values by using method
		
		stu1.getValues(10, "Hashim", 'A');
		stu2.getValues(11, "Hashi", 'B');
		stu3.getValues(12, "Hash", 'C');
		stu4.getValues(13, "Has", 'D');

		
		stu1.display();
		stu2.display();
		stu3.display();
		stu4.display();

				
	}

}
