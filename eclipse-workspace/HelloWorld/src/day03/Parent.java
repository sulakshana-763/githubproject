package day03;

public class Parent {
	
	int parentVar = 1000;
	
	void parentMethod() {
		System.out.println("I am a parent");
	}
	
	void secret() {
		System.out.println("I am a secret");
	}


	public static void main(String[] args) {
		
		Parent p = new Parent();
		System.out.println(p.parentVar);
		p.parentMethod();
		p.secret();
	}
}
