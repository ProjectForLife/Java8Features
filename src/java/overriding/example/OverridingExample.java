package overriding.example;

import java.io.FileNotFoundException;
import java.io.IOException;

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
		subclass.method4();
		
		
	}

}

class SuperClass{
	private void method1() {
		System.out.println("I am from superclass");
	}
	
	void method2() {
		System.out.println("I am from superclass method2");
	}
	
	void method3() {
		System.out.println("I am from superclass method3");
	}
	
	private void method4() {
		System.out.println("I am from superclass method4");
	}
	
	public Object method5() {
		return "";
	}
	
	public Object method6() throws IOException{
		return "";
	}
	
}

class SubClass extends SuperClass{
	private void method1() {
		System.out.println("I am from subclass");
	}	
	
	void method2() {
		System.out.println("I am from subclass method2");
	}
	
	//Cannot reduce the visibility of the inherited method from SuperClass
	/*private void method3() { 
		System.out.println("I am from superclass method3");
	}*/
	
	void method4() {
		System.out.println("I am from subclass method4");
	}
	
	//The return type must be the same or a more restrictive type, also known as covariant
	//return types.
	public String method5() {
		return "";
	}
	
//If any checked exceptions are thrown, only the same exceptions or subclasses of those
	//exceptions are allowed to be thrown.
	/*public Object method6() throws Exception {
		return "";
	}*/
	
	public Object method6() throws FileNotFoundException {
		return "";
	}
	
	
}