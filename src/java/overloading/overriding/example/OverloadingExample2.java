package overloading.overriding.example;

public class OverloadingExample2 {

	void method1(String test) {
		System.out.println(test);
	}
	
	void method1() {
		System.out.println("nothing passed");
	}
	
	void method1(Object object) {
		System.out.println("from Object" + object.toString());
	}
	
	public static void main(String[] args) {
		OverloadingExample2 overloadingExample2 = new OverloadingExample2();
		overloadingExample2.method1();
		overloadingExample2.method1("test");
		overloadingExample2.method1(new Object());
		overloadingExample2.method1(new Integer(2));
		overloadingExample2.method1(new String("test2"));

	}

}


