package S1T4E1N1;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

////botó dret a la classe en la que volem fer el Test i escollim JUnit (New JUnit Test Case) i fem la classe Test.

public class MesosTest {
	public static ArrayList<String> mesos = Mesos.mostrarMesos();

	@Test //es necessari possar @Test per que funcioni el Test 
	public void testMostrarMesos() {
		System.out.println("Els mesos de l'any son: ");
		
		for (int i = 0; i < mesos.size(); i++) {
			String veureMesos = mesos.get(i);
			System.out.println(veureMesos);
		}
	}
	
	@Test
	public void testMostraAgost() {
	String resultat1 = Mesos.mostrarMesos().get(7);
	String resultat2 = "agost";
	
	assertEquals(resultat1, resultat2);
	
	System.out.println(resultat1);
	System.out.println(resultat2);
}
	@Test
	public void testNotNull() {
	assertNotNull(mesos);	
	}
	
	@Test
	public void testTotalMesos() {
		
		assertEquals(12, mesos.size());
		System.out.println(mesos);
	}

}