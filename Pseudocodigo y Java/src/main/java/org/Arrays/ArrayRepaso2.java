package org.Arrays;

import java.util.Scanner;

public class ArrayRepaso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lista = {19, 23, 34, 45, 56, 67, 78, 89, 90, 13, 24, 35, 46, 57, 68};
		
		System.out.println("Dame un número para compararlo con la lista");
		int num = sc.nextInt();
		
		int mayor = 0;
		for (int i = 0; i < lista.length; i++) {
		if (num < lista[i]) {
			
			mayor++;
			}
		}
		System.out.println("Hay " +mayor +" números mayores en la lista que tu número");
		
		sc.close();
	}
	
	
}
