package org.Arrays;

public class ArrayRepaso1 {

	public static void main(String[] args) {
		int[]numeros = { 13, 24, 36, 48, 50, 3, 18, 29, 46, 19}; 
		int multiplicacion = 1;
		for (int i = 0; i < numeros.length; i++) {
			if (i % 2 !=0) {
				
				multiplicacion = multiplicacion * numeros[i];
			}
		}
		
		System.out.println("La multiplicacion de las posiciones impares es: " +multiplicacion);
	}

}
