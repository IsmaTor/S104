package S1T4E2N1;

import java.util.Scanner;

public class calculDni {
	static Scanner entrada = new Scanner(System.in);
	//variables
	private static int dni = 0;
	private static char lletra = ' ';
	
	//constructors
	public calculDni() {
		
	}
	
	public calculDni(int dni, char lletra) {
		this.dni = dni;
		this.lletra = lletra;
	}
	
	//mètode per calcular la lletra
	public static char calcularLletra(int dni) {
		char[] lletras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		return lletras [dni % 23];
	}
	
	//mètode per escriure el dni i calcular la lletra
	public static void llegir() {
		do {
			System.out.println("Introdueix el teu dni: ");
			dni = entrada.nextInt();
			
		} while (dni <= 0);
		
		lletra = calcularLletra(dni);
	}
	
	//mètode per retornar un String en format dni
	public String toString() {
		StringBuilder format = new StringBuilder();
		format.append(dni);
		format.append("-");
		format.append(lletra);
		
		return format.toString();
	}

}
