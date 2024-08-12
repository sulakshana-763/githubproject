package codeSnippet;

public class DayOfAWeek {
	
	void dayOfWeek(int dayOfAWeek) {
		
		switch (dayOfAWeek) {
		case 1:
			System.out.println("Day of the week is Sunday");
			break;
		case 2:
			System.out.println("Day of the week is Monday");
			break;
		case 3:
			System.out.println("Day of the week is Tuesday");
			break;
		case 4:
			System.out.println("Day of the week is Wednesday");
			break;
		case 5:
			System.out.println("Day of the week is Thursday");
			break;
		case 6:
			System.out.println("Day of the week is Friday");
			break;
		case 7:
			System.out.println("Day of the week is Saturday");
			break;
		}
	}

	public static void main(String[] args) {		
		DayOfAWeek day = new DayOfAWeek();
		day.dayOfWeek(1);
	}
}
