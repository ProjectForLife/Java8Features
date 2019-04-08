package overloading.overriding.example;


public class OverloadingExample {

	void method1(TestClass1 testClass1) {
		System.out.println(testClass1);
	}
	
	void method1(TestClass2 testClass2) {
		System.out.println(testClass2);
	}
	
	public static void main(String[] args) {
		//Exact Match By Type.
		OverloadingExample overloadingExample = new OverloadingExample();
		overloadingExample.method1(new TestClass1());
		overloadingExample.method1(new TestClass2());
	}
}

class TestClass1{
	
	public String toString() {
		return "I am from TestClass1";
	}
}

class TestClass2 {
	public String toString() {
		return "I am from TestClass2";
	}
}