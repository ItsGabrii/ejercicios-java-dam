package Ejercicios;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] lista = new int [10];

		
		for (int i = 0; i < lista.length; i++) {
			System.out.print("Introduce un número: ");
			lista[i] = sc.nextInt();
		}
		
		int mayor = lista[0]; //inicializamos mayor en la posicion 0 de nuestro array (primer valor)
		int menor = lista[0];
		int posMenor = 0;
		int posMayor = 0;
		
		for (int i = 0; i < lista.length; i++) { //recorremos array 
			if (lista[i] > mayor) { //comparamos valores
				mayor = lista[i]; //ponemos mayor el valor mas alto 
				posMayor = i;
			}
		}
		
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] < menor) { //comparamos
				menor = lista[i]; //ponemos menor el valor mas bajo 
				posMenor = i;
			}
		}
		
		System.out.println("El valor más alto es: " +mayor + " su posicion en el array es: " + posMayor);
		System.out.println("El valor más bajo es: " +menor + " su posicion en el array es: " +posMenor);
		
		sc.close();
		
	}

}

