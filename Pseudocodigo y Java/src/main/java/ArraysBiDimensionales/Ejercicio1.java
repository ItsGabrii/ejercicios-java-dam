package ArraysBiDimensionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el número de filas del array");
		int filas = sc.nextInt();
		System.out.println("Dime el número de columnas del array");
		int columnas = sc.nextInt();
		
		int [][] matriz = new int [filas][columnas];
		
		System.out.println("Introduce los datos del array");
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				System.out.println("Elemento [" +i +"][" +j +"]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("La matriz es: ");
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				System.out.println(matriz[i][j] + "");
			}
		}
		System.out.println();
		
		int minimo= Integer.MIN_VALUE;
		int maximo= Integer.MAX_VALUE;
		
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				minimo = matriz[i][j];
				maximo = matriz[i][j];
			}
		}
		System.out.println("El minimo de la matriz es: "+minimo);
		System.out.println("El maximo de la matriz es: "+maximo);
		
		sc.close();
	}
}