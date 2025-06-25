package EjerciciosAvanzados;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime cuantos suministros tienes");
		int suministros = sc.nextInt();
		
		int[] Inventario = new int [suministros]; //ponemos limite al array según el número de suministros que tengamos
		
		System.out.println("Ahora dime el peso de cada suministro en kilogramos");
		for (int i = 0; i < Inventario.length; i++) {
			Inventario[i] = sc.nextInt(); //introducimos el peso de cada suministro
			if(Inventario[i] < 1) { //validacion de peso
				System.out.println("El peso no puede ser menor de 1");
				return;
			}
		}
		
		int ligero = 0; //contador para la categoria ligero
		int normal = 0; //contador para la categoria normal
		int pesado = 0; //contador para la categoria pesado
		for (int i = 0; i < Inventario.length; i++) {
		
		if(Inventario[i] < 10) {
			ligero++;
			
		} else if (Inventario[i] >= 10 && Inventario[i] < 50) {
			normal++;
		} else if(Inventario[i] > 50) {
			pesado++;
		}
			
		}
		System.out.println("Suministros Ligeros (<10kg): " +ligero);
		System.out.println("Suministros Normales(10kg - 50kg): " +normal);
		System.out.println("Suministros Pesados(>50kg): " +pesado);
		
		sc.close();
	}
	
}
