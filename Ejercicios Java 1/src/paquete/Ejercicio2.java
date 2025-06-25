package paquete;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int HorasTrabajo = 0;
		float PrecioHora = 0;
		float sueldo = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime cuantas horas trabajas: ");
		HorasTrabajo = sc.nextInt();
		System.out.print("Dime cuanto cobras por hora: ");
		PrecioHora = sc.nextFloat();
	
		
		sueldo = HorasTrabajo * PrecioHora;
		
		System.out.println("Sueldo: "+sueldo);
		
		sc.close();
	}

}
