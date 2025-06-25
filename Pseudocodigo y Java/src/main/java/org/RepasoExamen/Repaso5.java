package org.RepasoExamen;

import java.util.Scanner;

public class Repaso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num = sc.nextInt();
		
		int sumaDivisores = 0;
		
		for ( int i = 1; i <= num/2; i++) {
			if(num % i ==0) {
				
				sumaDivisores += i;
				
			}
			
			
		}
		
		if (sumaDivisores == num) {
			System.out.println("El número es perfecto");
		} else {
			System.out.println("El número no es perfecto");
		}
		sc.close();
	}

}
