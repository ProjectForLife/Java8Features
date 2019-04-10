package overriding.example;

public class OverridingExample {

	public static void main(String[] args) {
		//The access modifier must be the same or more accessible
		
		SuperClass superclass = new SuperClass();
		SubClass subclass = new SubClass();
		SuperClass holdingSubClass = new SubClass();
		
		// you can not access private methods so method1 is not accessible
		subclass.method2();
		superclass.method2();
		holdingSubClass.method2();
		
	}

}

class SuperClass{
	private void method1() {
		System.out.println("I am from superclass");
	}
	
	void method2() {
		System.out.println("I am from superclass method2");
	}
}

class SubClass extends SuperClass{
	private void method1() {
		System.out.println("I am from subclass");
	}	
	
	void method2() {
		System.out.println("I am from subclass method2");
	}
}