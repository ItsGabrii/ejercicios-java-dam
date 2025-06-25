package org.pseudocodigo;

import java.util.Scanner;

public class MayordeTresBucle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mayor =0;
		
		for (int i=1; i<=3; i++) {
			System.out.println("Introduce el número "+i);
			int num = sc.nextInt();
			if (i==1) {
				mayor=num;
			}
			
			if(num>mayor) {
				mayor=num;
			}
		}
	
		System.out.println("El mayor es "+mayor);
	}

}
