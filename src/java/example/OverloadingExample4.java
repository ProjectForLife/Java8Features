package overloading.overriding.example;

public class OverloadingExample4 {

	void method1(Integer i) {
		System.out.println("from Integer" + i);
	}
	
	void method1(int i) {
		System.out.println("from int" + i);
	}
	
	void method1(Long k) {
		System.out.println("from long" + k);
	}
	
	public static void main(String[] args) {
		//Converting to an autoboxed type 
		OverloadingExample4 overloadingExample2 = new OverloadingExample4();
		overloadingExample2.method1(10890);
		overloadingExample2.method1(new Integer(10890));
		overloadingExample2.method1(10890l);		
	}

}


