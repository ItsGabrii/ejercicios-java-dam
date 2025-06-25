package EjerciciosObjetos;

import java.util.Scanner;

public class Inicio2 {

	public static void main(String[] args) {
		Calculos2 calculos = new Calculos2();
		Scanner sc = new Scanner(System.in);
		int[] matriz = new int[5];
		
		System.out.print("Dime el numero 1: ");
		int num1 = sc.nextInt();
		
		System.out.print("Dime el numero 2: ");
		int num2 = sc.nextInt();
		
		System.out.print("Dime el numero 3: ");
		int num3 = sc.nextInt();
		
		System.out.print("Dime el numero 4: ");
		int num4 = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Elemento " + (i + 1) + ": ");
			matriz[i] = sc.nextInt();
		}
		
		System.out.println();
	    System.out.println("Elementos de la matriz: ");
	    for (int i = 0; i < matriz.length; i++) {
	        System.out.print("Elemento " + (i + 1) + ": " + matriz[i]);
	    }
		
	    System.out.println();
		System.out.println("Suma de 2 parámetros: " +calculos.suma(num1,num2));
		System.out.println("Suma de 3 parámetros: " +calculos.suma(num2,num1,num3));
		System.out.println("Suma de 4 parámetros: " +calculos.suma(num4,num3,num2,num1));
		System.out.println("Suma de los elementos de la matriz: " +calculos.suma(matriz));

		sc.close();
	}

}
