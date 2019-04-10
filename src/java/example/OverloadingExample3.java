package overloading.overriding.example;

public class OverloadingExample3 {

	void method1(int i) {
		System.out.println("from int" + i);
	}
	
	void method1(float k) {
		System.out.println("from float" + k);
	}
	
	public static void main(String[] args) {
		//Converting to a larger primitive type. Compiler looks 
		//for long as the long method is not aviable then it calls the float method. 
		OverloadingExample3 overloadingExample2 = new OverloadingExample3();
		overloadingExample2.method1(10890);
		overloadingExample2.method1(100l);
		
		
	}

}


