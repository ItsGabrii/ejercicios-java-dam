package arrays;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		
		int matriz[] = new int [5]; //defino array
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < matriz.length; i++) { //pido valores del array
			System.out.print("Introducir número entero : ");
			matriz[i] = sc.nextInt();
			
		}
		
		System.out.println("\nNúmeros recogidos: ");
		System.out.println("");
		for (int i = 0; i < matriz.length; i++) { //imprimo valores 
			System.out.println("Número "+ (i +1) +": " +matriz[i]+".");
		
		}
		
		sc.close();
	}

}

