package overloading.overriding.example;

public class OverloadingExample5 {

	void method1(byte... i) {
		System.out.println("from byte" + i);
	}
	
	void method1(int i) {
		System.out.println("from int" + i);
	}
	
	void method1(Long k) {
		System.out.println("from long" + k);
	}
	
	public static void main(String[] args) {
		//Varargs. Compiler first looks for exact type if not 
		//then look for next higher level primitive if not found then it will look for Wrapper class
		//still if it is not found then it will look for var args
		OverloadingExample5 overloadingExample2 = new OverloadingExample5();
		byte b = 72;
		overloadingExample2.method1(b);
		overloadingExample2.method1(b, b, b);
		overloadingExample2.method1(new Integer(10890));
		overloadingExample2.method1(10890l);		
	}

}


