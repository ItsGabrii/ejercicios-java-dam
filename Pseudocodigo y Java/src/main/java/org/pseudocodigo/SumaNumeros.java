package org.pseudocodigo;

import java.util.Scanner;

public class SumaNumeros {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer número: ");
		int num1= sc.nextInt();
		System.out.println("Ingresa el segundo número: ");
		int num2= sc.nextInt();
		int suma= num1 + num2;
		System.out.println("La suma es: " +suma);
	}

}
