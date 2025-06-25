package org.RepasoExamen;

import java.util.Scanner;

public class Repaso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una frase");
		String frase = sc.nextLine(); //esto es para los strings sc.nextLine();
		
		String[] palabras = frase.split(" "); //funcion split en la frase, " " lo separa por espacios
		
		String palabraMasGrande = ""; //variable para la palabra mas grande 
		
		for (String palabra : palabras) { //con esto recorres tu frase y comparas palabra a palabra
			if(palabra.length() > palabraMasGrande.length()) {
			
				palabraMasGrande = palabra;
		
			}
			
		}
		
		System.out.println("La palabra mas grande de tu frase es: "+palabraMasGrande);
		
		sc.close();
		

	
}
	
	
	
}
