package org.RepasoExamen;
import java.util.Scanner;

public class Repaso3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el precio de su producto");
		System.out.println("Si su objeto vale 1000€ obtendra un descuento del 10%");
	    double precio = sc.nextDouble();
		
		
		if (precio >= 1000) {
			
		 double descuento = precio * 0.10; //para calcular % tiene que llevar un . Ej 0.10 para calcular el 10%
		 double preciofinal = precio - descuento; // se le aplica el descuento
		 System.out.println("Tu produto obtiene un 10% de descuento");
		 System.out.println("Su precio final con el descuento aplicado es: "+preciofinal); //imprimos precio con el descuento aplicado
		} else {
			System.out.println("Su objeto no cumple las condiciones para que se le aplique un descuento");
			System.out.println("Precio: " +precio);
		}
		sc.close();

	}
	
	

}
