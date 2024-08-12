package day01;
import java.util.Scanner;

public class StudentUsingScanner {
	Scanner sc = new Scanner(System.in);
	
	byte subject1 = sc.nextByte();
	byte subject2 = sc.nextByte();
	byte subject3 = sc.nextByte();
	byte subject4 = sc.nextByte();	
	int sum;
	
	void sum() {
		sum = subject1 + subject2 + subject3 + subject4;
	}
	
	void average() {
		sum = (subject1 + subject2 + subject3 + subject4)/4;
	}

	public static void main(String[] args) {
		
		StudentUsingScanner student1 = new StudentUsingScanner();
		//System.out.println(student1.sum());
		

	}

}
