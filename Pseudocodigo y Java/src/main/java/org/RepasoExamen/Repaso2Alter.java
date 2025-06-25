package org.RepasoExamen;

import java.util.Scanner;

public class Repaso2Alter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos productos has comprado");
		int numeroProductos = sc.nextInt();
		int total = 0;
		for (int i = 1; i <=numeroProductos; i++ ) {
			System.out.println("Dime el precio del producto " +i);
			int precio = sc.nextInt();
			 total += precio;
		}
		
		System.out.println("El total de la compra fue: " +total);
		
		sc.close();

	}

}
