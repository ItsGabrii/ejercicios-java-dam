package EjerciciosAvanzados;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();// creas un random
	
	int [] array = new int [10];
	
	for (int i = 0; i < array.length; i++) {
		System.out.println("Introduce un número");
		array[i] = sc.nextInt();
		
	}
	
	int numeromagico = random.nextInt(10)+1;
	int suma = 0;
	
	System.out.println("Número Magico: " +numeromagico);
	
	for (int i = 0; i < array.length; i++) {
		if(array[i] % numeromagico == 0) {
			suma+= array[i];
		}
	}
	System.out.println("Suma de número divisibles por el número mágico: " +suma);
	
	if (suma > 50) {
		System.out.println("¡Has escapado!");
	}else {
		System.out.println("Te quedas atrapado");
	}
	sc.close();
	}

}
