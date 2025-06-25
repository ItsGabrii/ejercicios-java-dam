package Cadenas;

import java.util.Scanner;

public class compareTo {

	public static void main(String[] args) {
		// Crear un escáner para la entrada del usuario
		Scanner scanner = new Scanner(System.in);
 
		// Solicitar al usuario que introduzca dos cadenas
		System.out.print("Introduce la primera cadena: ");
		String cadena1 = scanner.nextLine();
		System.out.print("Introduce la segunda cadena: ");
		String cadena2 = scanner.nextLine();
 
		// Comparar las cadenas usando compareTo
		int resultado = cadena1.compareTo(cadena2);
		
		//Compara en base a la primera letra de cada cadena 
		// A menor ---- Z mayor 
		
		//Mayusculas van antes que las minusculas
		// Mayus menor --- Minus mayor
		
 
		// Mostrar el resultado de la comparación
		if (resultado < 0) {
			System.out.println(
					"La primera cadena es menor que la segunda.");
		} else if (resultado > 0) {
			System.out.println(
					"La primera cadena es mayor que la segunda.");
		} else {
			System.out.println("Ambas cadenas son iguales.");
		}
 
		// Cerrar el escáner
		scanner.close();
	}
}


