package arrays;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//defino variables
		int cantidad = 0;
		int[] array;
		
		System.out.println("Dime la longitud del array"); //pido la longitud del array
		cantidad = sc.nextInt();
		
		array = new int [cantidad]; //asigno dicha longitud al array
		
		
		System.out.println("Ahora intoduce los valores: "); //pido los valores del array
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Los elementos del array son: "); //imprimo los valores
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		sc.close();
	}

}
