package day01;

public class Student {
	
	byte subject1;
	byte subject2;
	byte subject3;
	byte subject4;
	int sum;
	
	void sum(){		
		sum = subject1 + subject2 + subject3 + subject4;
		System.out.println("Total Marks = " + sum);
	}
	
	void average() {
		sum = (subject1 + subject2 + subject3 + subject4)/4;	
		System.out.println("Average = " + sum);
	}

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.subject1 = 45;
		student1.subject2 = 50;
		student1.subject3 = 49;
		student1.subject4 = 47;
		student1.sum();
		student1.average();
		
		Student student2 = new Student();
		student2.subject1 = 50;
		student2.subject2 = 60;
		student2.subject3 = 70;
		student2.subject4 = 80;
		student2.sum();
		student2.average();
		
		Student student3 = new Student();
		student3.subject1 = 50;
		student3.subject2 = 60;
		student3.subject3 = 70;
		student3.subject4 = 80;
		student3.sum();
		student3.average();
		
		Student student4 = new Student();
		student4.subject1 = 50;
		student4.subject2 = 60;
		student4.subject3 = 70;
		student4.subject4 = 80;
		student4.sum();
		student4.average();

		

		
	}

}
