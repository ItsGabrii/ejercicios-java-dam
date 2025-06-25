package EjerciciosAvanzados;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int [] array = new int [10];
	
	for (int i = 0; i < array.length; i++) {
		System.out.println("Introduce el numero " +(i + 1));
		array[i]=sc.nextInt();
	}
	
	int mayor = array[0];
	int indiceMayor = 0;
	for (int i = 0; i < array.length; i++) {
		if(array[i] > mayor) {
			mayor = array[i];
			indiceMayor = i; 
		}
	}
	
	int menor = array[0];
	int indiceMenor = 0;
	for (int i = 0; i < array.length; i++) {
		if(array[i] < menor) {
			menor = array[i];
			indiceMenor = i;
		}
		
		
	
	}
		System.out.println("El número mayor es: " +mayor +" y esta en la posición: " +indiceMayor);
		System.out.println("El número menor es: " +menor +" y esta en la posición: " +indiceMenor);
	
	int suma = mayor + menor + indiceMayor + indiceMenor;

		System.out.println("La suma del número mayor, número menor  y sus posiciones en el array son: " +suma);

		if(suma >= 50) {
			System.out.println("¡Tesoro Encontrado!");
	
		} else {
			System.out.println("Sigue buscando");
	
		}

	sc.close();
  }
}
