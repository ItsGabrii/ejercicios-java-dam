package org.pseudocodigo;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la nota del alumno");
		int nota = sc.nextInt();
		
		switch (nota) {
		case 1:
			if (nota >= 5 && nota <= 6) {
				System.out.println("Esta aprobado y es un BIEN");
				
			}
			
			break;
		case 2:
			if (nota >= 7 && nota <= 8) {
				System.out.println("Esta aprobado y es un NOTABLE");
				
			}
			
			break;
		case 3:
			if (nota >= 9 && nota <= 10) {
				System.out.println("Esta aprobado y es un SOBRESALIENTE, ¡¡FELICIDADES!!");
				
			}
			
			break;
		case 4:
			if (nota >= 0 && nota < 5) {
				System.out.println("Esta suspenso");
				
			}
			
			break;

		}
		sc.close();
	}

}
