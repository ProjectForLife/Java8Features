package java.overloading.overriding;

public class BobcatKitten extends Bobcat{
	public void findDen() { } // this is overridden from the superclass.
	public void findDen(boolean b) { } // this is overloaded
	public int findden() throws Exception { return 0; } // this is not overload becuase the method name is different
}
