package org.pseudocodigo;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer número: ");
		int num1= sc.nextInt();
		System.out.println("Ingresa el segundo número: ");
		int num2= sc.nextInt();
		
	
		if(num1 % num2 == 0 && num2 !=0) { 
			System.out.println("Son divisibles");
		}
		else {
			System.out.println("No son divisibles");
		}

	}

	}

