package S1T4E1N2;

import org.hamcrest.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*; 	//Perquè tots els aparelladors estiguin disponibles a l'arxiu
											
public class RunToMordorTest {

	@Test //creem la paraula 
	public void CrearAnillo() { 
		RunToMordor anillo = new RunToMordor("Mordor");
		anillo.getParaula();
		System.out.println(anillo.getParaula());
		MatcherAssert.assertThat(anillo.getParaula(), length(is(8))); //comparem "Mordor" i diem si te 8 lletras amb l'aparellador "assertThat"
	}
	//Un comparador personalitzat que proporcioni el "length" longitud i la compara amb una cadena "String"
	public static  FeatureMatcher<String, Integer> length(Matcher<? super Integer> matcher ){
	    return new FeatureMatcher<String, Integer>(matcher, "La longitud escrita es ", "longitud real") {
	        @Override //sobreescrivim el mètode que retorna el valor que passarà al mètode embolicat matches()/ .matchesSafely()
	        protected Integer featureValueOf(String actual) {
	          return actual.length();
	        }
	    };
	}
}
