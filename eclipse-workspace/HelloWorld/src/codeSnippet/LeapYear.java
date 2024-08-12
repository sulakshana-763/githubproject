package codeSnippet;

public class LeapYear {
	
	void leapyear(){
		for(int year=2000; year<=2100;year=year+4){
			if(year%4==0) {
				System.out.println("Year " + year + " is a leap year");
			}else {
				System.out.println("Year " + year + " is not a leap year");
			}			
		}		
	}

	public static void main(String[] args) {
		LeapYear checkIfLeapYear = new LeapYear();
		checkIfLeapYear.leapyear();
	}

}
