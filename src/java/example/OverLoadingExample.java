package java.example;

public class OverLoadingExample {
	
	void method1(SuperClass superclass) {
		System.out.println(superclass);
	}
	
	void method1(SubClass subclass) {
		System.out.println(subclass);
	}

	public static void main(String[] args) {
		OverLoadingExample overLoadingExample = new OverLoadingExample();
		overLoadingExample.method1(new SubClass());
	}
}

class SuperClass{
	
	public String toString() {
		return "I am from superclass";
	}
}

class SubClass extends SuperClass{
	public String toString() {
		return "I am from subclass";
	}
}

