package java.access.modifiers.species;

import java.access.modifiers.BigCat;

public class Lynx extends BigCat { 
	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.name);
		//System. out .println(cat.hasFur); Does not compile because of the parent class BigCat reference. 
		//System. out .println(cat.hasPaws); Does not compile because of hasPawa in different package.
		//System. out .println(cat.id); Does not compile because of id is declared as private
	}
}