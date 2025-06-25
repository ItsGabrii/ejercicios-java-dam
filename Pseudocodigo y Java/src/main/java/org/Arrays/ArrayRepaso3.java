package org.Arrays;

import java.util.Scanner;

public class ArrayRepaso3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lista = new int [5];
		
		System.out.println("Dame 5 números para ponerlos en una lista");
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Número " +(i + 1) +": "); //esto es para que el conteo empiece en 1 y no en 0
			lista[i] = sc.nextInt();
		}
		
		
		System.out.println("Ahora dame un limite");
		int limite = sc.nextInt();
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] < limite) {
				int multiplicacion = lista[i] * 2;
				
				System.out.println("El número " +lista[i] +" multiplicado por 2 es: " +multiplicacion);
			}
		}
		
		
		
		sc.close();
		
	}

}
