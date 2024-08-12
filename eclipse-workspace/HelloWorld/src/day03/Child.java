package day03;

public class Child extends Parent {
	
	int childVar = 100;
	
	void childMethod() {
		System.out.println("I am child");
	}
	
	void secret() {
		System.out.println("I am a child secret");    //method overriding  since Final key word is not used if used no overriding
	}


	public static void main(String[] args) {
		
		Child c = new Child();
		c.childMethod();
		System.out.println(c.childVar);
		c.parentMethod();
		System.out.println(c.parentVar);
		c.secret();
	}
}
