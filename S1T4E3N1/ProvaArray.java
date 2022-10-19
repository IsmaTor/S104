package S1T4E3N1;

import java.util.ArrayList;

public class ProvaArray {

	//ArrayIndexOutOfBoundsException Quan l'índex es negatiu o mes gran o igual que la mida de la matriu.
	
	public static ArrayList<String> concesionari() throws ArrayIndexOutOfBoundsException {
		
		ArrayList<String> cotxes = new ArrayList<String>();
		/*
		cotxes.add("Mercedes");
		cotxes.add("Hyundai");
		cotxes.add("Suzuki");
		cotxes.add("Ferrari");
		cotxes.add("Fiat");
		*/
		for (int i = 0; i < cotxes.size(); i++) {
			System.out.println(cotxes.get(i));
		}
		
		throw new ArrayIndexOutOfBoundsException("Has d'afegir cotxes al concesionari.");
		
	}
	
	 
	
	
	
	
	
	
}
