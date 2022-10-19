package S1T4E2N1;

import static org.junit.Assert.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class calculDniTest {

	@ParameterizedTest //permet afegir altres anotacions en aquest cas CsvSource
	
	@CsvSource({"46066684,F", 	//@CsvSource Pasa un valor d'entrada i un valor esperat al mètode de prova
				"47898986,Z",	//Afirma el valor real amb l'esperat
				"12345678,Z",	//accepta una matriu de valors separats per comas i cada entrada de la matriu correspon a una linea en un arxiu Csv 
				"87654321,X",	//També fa una toma d'entrada de matriu cada vegada, la divideix per comas i passa cada matriu al mètode de prova anotat com paràmetres separats     
				"47716413,S",	//Per defecte, la coma es el separador de columnas, però podem personalitzar-ho amb l'atribut delimitador:
				"24681357,B",	//@CsvSource(value = {"test:test", "tEst:test", "Java:java"}, delimiter = ':')
				"98765432,M",
				"45987128,P",
				"65498412,R",
				"95365482,F"})
	public void testDni(int dni, char lletra) { //posem el valor d'entrada "dni" + valor esperat "lletra"
		
		char lletraAcertada = calculDni.calcularLletra(dni); //creem una variable i al mètode calcularLletra fiquem el numero de dni
		assertEquals(lletra, lletraAcertada); //compara la lletra amb el valor esperat
		System.out.println(dni + "-" + lletra + ":" + lletraAcertada); //ho mostra
	}
}
