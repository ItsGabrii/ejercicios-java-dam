package EjerciciosObjetos;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		//clase nombre  = new clase
		Destino destino = new Destino();
		Scanner sc = new Scanner(System.in);
		destino.mostrarMensaje();
		
		System.out.println("Dime un nombre");
		String nombre = sc.nextLine();
		
		destino.saludarNombre(nombre);
		
		System.out.println();
		System.out.println("Dime dos valores");
		System.out.print("Valor 1: ");
		int valor1 = sc.nextInt();
		System.out.print("Valor 2: ");
		int valor2 = sc.nextInt();
		
		destino.Suma(valor1, valor2);
		
		System.out.println();
		System.out.print("Dime un número para hacer su cuadrado: ");
		int valor3 = sc.nextInt();
		
		System.out.println("El cuadrado de " + valor3 + " es: " + destino.cuadrado(valor3));
		System.out.println();
		
		double dato = destino.calcularPromedio(3,4);
		System.out.println(dato);
		
		sc.close();
		

		
		
		
		
		
		
		
		
		
		
	}

}
