package org.Arrays;

import java.util.Scanner;

public class ArrayRepaso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lista = new int [10];
		
		int negativo = 0;
		int positivo = 0;
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Número " +(i + 1) +": "); //esto es para que el conteo empiece en 1 y no en 0
			lista[i] = sc.nextInt();
		}
	
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] > 0) {
	
				
				positivo++;
				
			} else {
				
				negativo++;
			}
			
		}
		for (int i = 0; i < lista.length; i++) {
			
			System.out.println(lista[i] +" ");
		}
		System.out.println("Hay " +positivo +" números positivos en el array");
		System.out.println("Hay " +negativo +" números negativos en el array");
		
		
		
		
		
		
		sc.close();
		
	}
	
	
	
	

}
