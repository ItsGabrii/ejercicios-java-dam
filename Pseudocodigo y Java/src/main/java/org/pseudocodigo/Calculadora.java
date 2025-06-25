package org.pseudocodigo;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número para que opere con el ");
		int num1 = sc.nextInt();
		
		sc.nextLine(); //esto lo que hace es que funcione el string, importante declararlo antes de pedirlo

		System.out.println("¿Que quieres hacer? (+ - * /)");
		String operacion = sc.nextLine();
		System.out.println("Dame el segundo número");
		int num2= sc.nextInt();
		int resultado;
		switch (operacion) {
		case "+":
	        resultado = num1 + num2;
			System.out.println(+resultado);
			break;
		case "-":
			resultado = num1 - num2;
			System.out.println(+resultado);
			break;
		case "*":
			resultado = num1 * num2;
			System.out.println(+resultado);
			break;
		case "/":
			if (num2 != 0) {
				resultado = num1 / num2;
				System.out.println(+resultado);
				
			} else {
				System.out.println("No se puede dividir entre cero");
			}
			break;
		default:
			System.out.println("Operacion no valida");
			break;
		}
		
		sc.close();
	}
	
}
