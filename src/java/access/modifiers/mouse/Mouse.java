package java.access.modifiers.mouse;

import java.access.modifiers.BigCat;

public class Mouse {
	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.name);
		//System. out .println(cat.hasFur); Does not compile because of hasFur is declared as protected and this class is not sub class of BigCat
		//System. out .println(cat.hasPaws); Does not compile because of hasPawa in different package.
		// System. out .println(cat.id); Does not compile because of id is declared as private
	}
}
