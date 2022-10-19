package S1T4E3N1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class ProvaArrayTest {
	static ArrayList<String> newCotxes = new ArrayList<String>();
	/*
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testArray() {
		
		newCotxes = ProvaArray.concesionari();
		assertThrows(ArrayIndexOutOfBoundsException.class, null);
	}
	
	///////////////////////////////////////////////////////////
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testArray2() {
		try {
			ProvaArray.concesionari();
			
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	///////////////////////////////////////////////////////////////
	@BeforeEach
	public void testInit() {
		
		
		newCotxes = ProvaArray.concesionari();
		
	}
	
	@Test
	public void testArray3() {
		assertTrue(newCotxes != null);
	}
	*/
	
	@Test (expected = ArrayIndexOutOfBoundsException.class) //utilitzem l'atribut esperat anotat per declarar que esperem
	public void testArray4() {								//que es realitzi la exepció
		ProvaArray.concesionari();							//si està vuit llençarà l'exepció
	}

}