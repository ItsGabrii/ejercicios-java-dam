package org.Arrays;

public class Array4 {

	public static void main(String[] args) {
		int[]numeros = {5, 4, 8, 9, 9, 7};
		int suma = 0;
		
		for (int numero : numeros) { //recorres el array
			suma += numero; //sumas todos los valores del array
		}
		
		double promedio = (double) suma/numeros.length; /*con esto haces el promedio
		 												(double) resumes y te quitas tiempo*/
		System.out.println("El promedio de los valores es: " +promedio);
		
	}

}
