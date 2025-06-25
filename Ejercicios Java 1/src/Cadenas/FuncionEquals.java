package Cadenas;

import java.util.Scanner;

public class FuncionEquals {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		// Solicitar la primera contraseña
		System.out.print("Introduce tu contraseña: ");
		String contrasena1 = scanner.nextLine();
 
		// Solicitar la segunda contraseña
		System.out.print("Repite tu contraseña: ");
		String contrasena2 = scanner.nextLine();
 
		// Verificar si las contraseñas coinciden
		if (contrasena1.equals(contrasena2)) {
			System.out.println(
					"¡Contraseña establecida con éxito!");
		} else {
			System.out.println(
					"Las contraseñas no coinciden. Intenta de nuevo.");
		}
 
		// Cerrar el escáner
		scanner.close();
	}


	}


