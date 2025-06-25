package org.RepasoExamen;

import java.util.Scanner;

public class Repaso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número");
		int num = sc.nextInt();
		
		int sumaCuadrados = 0;
		if (num != 0) {
			
		for(int i = 1; i <= num; i++) {
			sumaCuadrados= i * i;
			
		System.out.println("La suma de los cuadrados de " +i +" es: " +sumaCuadrados);
		}
		
		} else {
			
			System.out.println("No vale poner 0 >:(");

		}
		sc.close();
	}

}
