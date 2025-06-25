package ArraysBiDimensionales;

import java.util.Scanner;

public class ArrayEjemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de filas");
		int filas = sc.nextInt();
		System.out.println("Introduce el número de columnas");
		int columnas = sc.nextInt();
		
		//Declaras Array
		int [][] array = new int [filas][columnas]; 
		
		//Pones valores al array
		System.out.println("\nIntroduce los elementos del array"); 
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++){
				
				System.out.println("Elemento [" +i +"][" +j +"]: ");
				array[i][j]= sc.nextInt();
				
			}
		}
	

		System.out.println("La matriz es: "); //Imprimes la matriz
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++){
				System.out.println(array[i][j] +" ");
			}
			System.out.println();
		}
		int suma = 0;
		for(int i=0; i < filas; i ++){
			for(int j = 0; j < columnas; j++){ //haces una suma del array bidimensional
				suma += array[i][j];
			}
		}
		
		System.out.println("La suma es: " +suma);
		
		//suma diagonal de un array bidimensional 
		
		int suma1 = 0;
		int suma2 = 0;
		for(int i=0; i < filas; i ++) {
			for(int j = 0; j < columnas; j++){
				if (i == j) {
					suma1 += array[i][j];
				}
				if (i+j == filas -1) {
					suma2 += array[i][j];
				}
			}
		}
		System.out.println("La suma de la primera diagonal es: "+suma1);
		System.out.println("La suma de la segunda diagonal es: "+suma2);
		
		sc.close();
	}

}
