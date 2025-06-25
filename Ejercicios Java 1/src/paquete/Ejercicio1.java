package paquete;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		String parrafo = "";
		String palabra = "";
		int entero = 0;
		float decimal = 0F;
		double doble = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un párrafo: ");
		parrafo = sc.nextLine(); 
		
		System.out.print("Introduce una palabra: ");
		palabra = sc.next();
		
		System.out.print("Introduce un entero: ");
		entero = sc.nextInt();
		
		System.out.print("Introduce un float: ");
	    decimal = sc.nextFloat();
		
		System.out.print("Introduce un double: ");
		doble = sc.nextDouble();
		
		System.out.println("\nMostamos datos...");
		System.out.println("\nPárrafo: "+parrafo);
		System.out.println("Palabra: " +palabra);
		System.out.println("int: " +entero);
		System.out.println("float: " +decimal);
		System.out.println("double: " +doble);
		
		sc.close();
	}

}
