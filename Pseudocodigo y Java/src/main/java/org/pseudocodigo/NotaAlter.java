package org.pseudocodigo;

import java.util.Scanner;

public class NotaAlter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la nota del alumno");
		double nota = sc.nextDouble();	
		int notaredondeo = (int)(nota + 0.5);
		switch (notaredondeo) {
		case 1:
			System.out.println("Suspenso");
			break;
		case 2:
			System.out.println("Suspenso");
			break;
		case 3:
			System.out.println("Suspenso");
			break;
		case 4:
			System.out.println("Suspenso");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
			System.out.println("Notable bajo");
			break;
		case 8:
			System.out.println("Notable alto");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 10:
			System.out.println("Sobresaliente ¡¡Felicidades!!");
			break;

		
		}
		sc.close();
	}
	
	
}
