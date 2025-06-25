package org.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int[] lista = {1,2,3,4,5,6,7,8,9,10};
		int pares = 0;
		int impares = 0;
		
		System.out.println("Los números pares son: ");
		for (int i=0; i < lista.length; i++) { //recorre array 
			if (lista[i]% 2 == 0) {
				System.out.println(lista[i]+" "); //imprimir número par
				pares++;
				
			}
		}
			
			System.out.println("Los números impares son: ");
			for (int i=0; i < lista.length; i++) {
				if (lista[i]% 2 != 0) {
					System.out.println(lista[i]+" "); //imprimir número impar
					impares++;
					
				}	
		}
			
		System.out.println("Hay " +pares +" números pares");
		System.out.println("Hay " +impares +" números impares");
	}

}
