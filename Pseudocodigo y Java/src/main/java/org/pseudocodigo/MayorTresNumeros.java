package org.pseudocodigo;

import java.util.Scanner;

public class MayorTresNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el número 1");
		int num1 = sc.nextInt();
		System.out.println("Ingresa el número 2");
		int num2 = sc.nextInt();
		System.out.println("Ingresa el número 3");
		int num3 = sc.nextInt();
		
		int mayor = 0;
		
		if (num1>num2 && num1>num3) {
			 mayor = num1;
		} else if (num2>num1 && num2>num3) {
			mayor =num2;
		} else if (num3>num1 && num3>num2) {
			mayor =num3;
		}
		
		System.out.println("El mayor es "+mayor);			
		}

	}


