package org.pseudocodigo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un número para hacer su factorial");
		int num = sc.nextInt();
		
		int factorial = 1;
		
		for( int i=1; i<=num; i++) {
			factorial*=i;
		}
		System.out.println("El factorial de " + num + " es " + factorial);
	}

}
