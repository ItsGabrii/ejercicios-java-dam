package org.Arrays;
import java.util.Scanner;

public class ArrayRepaso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] lista = {14, 25, 45, 34, 56, 76, 87,  100,};
		
		for (int i = 0; i < lista.length; i++) { //recorres array
			System.out.println(" Numero "+ (i + 1) +": " +lista[i]); //para que te ponga numero 1, etc etc...
		}
		
		System.out.println("Dame un número"); //le pedimos al usuario un número
		int num = sc.nextInt();
	
		for (int i = 0; i < lista.length; i++) { //recorres array
		if (num % lista[i] == 0 && num !=0) { //averiguamos multiplos del número con los valores del array
			
			lista[i] = 0; //si hay algun multiplo lo sustituimos por 0 en nuestro array
			}	
		}
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Nuevo Array: " +lista[i]); //imprimimos nuevo array
		}
		sc.close();
	}

}
