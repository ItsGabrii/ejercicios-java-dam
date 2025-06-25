package org.Arrays;

import java.util.Random;

public class Array1{
	public static void main(String[] args) {

		int[] lista = new int[10];
		Random random = new Random(); //Con esto haces un random
		
		
		for (int i = 0; i < lista.length; i++) {
			lista[i]= random.nextInt(100)+1; // Generar aleatorio entre 1 y 100
			System.out.println("El número es " +lista[i]);
		}
		
		int max = lista[0]; //Suponemos que el primer número es el maximo
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] > max) { //Comparamos cada número de la lista 
				
				max = lista[i]; //actualizamos el maximo 
				
			}
		}
		
		
		System.out.println("El número maximo es: "+max);
		
		
}

}