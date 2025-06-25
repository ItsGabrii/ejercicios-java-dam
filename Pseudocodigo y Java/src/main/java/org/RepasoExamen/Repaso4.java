package org.RepasoExamen;

import java.util.Scanner;

public class Repaso4 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el primer número");
		int num1 = sc.nextInt();
		System.out.println("Escribe el segundo número");
		int num2 = sc.nextInt();
		
		if (num2 < num1) {
			System.out.println("El segundo número debe ser mayor al primer número");
			return;
		}
		System.out.println("Los numeros pares que hay en ese rango son: ");
		for( int i = num1; i < num2; i++ ) { //rango de numeros num1 - num2
			
			if (i % 2 == 0) { //averiguar pares
				System.out.println(i);
			}	
		
		}
		
		sc.close();

	}

}