package arrays;


import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		int limite = 5;
		int[] matriz = new int[limite];
		
		System.out.println("Dime los números de la matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Los números que son mayores de 10 son: ");
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i] > 10) {
				contador++;
				System.out.println(matriz[i]);
			}
		}
		
		System.out.println("\nHay " +contador + " números mayores que 10");

	}

}
