package Cadenas;

import java.util.Scanner;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		// Nombre esperado
		String nombreEsperado = "Luis";
 
		// Solicitar al usuario que ingrese un nombre
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un nombre: ");
		String nombreIngresado = scanner.nextLine();
 
		// Comparar cadenas ignorando mayúsculas y minúsculas
		if (nombreEsperado.equalsIgnoreCase(nombreIngresado)) {
			System.out.println("¡Nombre correcto!");
		} else {
			System.out.println("Nombre incorrecto.");
		}
 
		// Cerrar el escáner
		scanner.close();
	}
}