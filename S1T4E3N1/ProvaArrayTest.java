package S1T4E3N1;

import org.junit.Test;

public class ProvaArrayTest {
	
	@Test (expected = ArrayIndexOutOfBoundsException.class) //utilitzem l'atribut esperat anotat per declarar que esperem
	public void testArray4() {								//que es realitzi la exepció
		ProvaArray.concesionari();							//si està vuit llençarà l'exepció
	}

}