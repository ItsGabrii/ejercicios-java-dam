package org.pseudocodigo;

import java.util.Scanner;

public class ContarPosNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int positivos= 0, negativos= 0;
		for(int i=0; i<4;i++) { 
			System.out.println("Ingresa un número");
			int num = sc.nextInt();
			
			if(num > 0) {
				positivos++;
							
			} else if (num < 0) { 
				negativos++;
	
			}
			
			
		}
		
		System.out.println("Número positivos " +positivos);
		System.out.println("Número negativos " +negativos);

	}

}
