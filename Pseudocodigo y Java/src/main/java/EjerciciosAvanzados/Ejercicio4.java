package EjerciciosAvanzados;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] lista = new int [12];
		
		System.out.println("Dame 12 numeros");
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Número " +(i+1));
			lista[i] = sc.nextInt();
		}
		
		System.out.println("Dime cuantas veces lo quieres rotar hacia la derecha");
		int rotaciones = sc.nextInt();
		rotaciones = rotaciones % lista.length; //esto para verificar que no se pase de la longitud del array en este caso 12
		
		int [] listarotada = new int [12]; 
		
		for (int i = 0; i < listarotada.length; i++) { //recorro el array
		int PosicionNueva = (i + rotaciones) %lista.length;	//sumo las rotaciones
		listarotada[PosicionNueva] = lista[i]; //con la rotacion hecha lo pongo en un array
		}
		
		
		System.out.println("Lista original: ");
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i] +"");
		}
		
		System.out.println("Lista Rotada: ");
		for (int i = 0; i < listarotada.length; i++) {
			System.out.println(listarotada[i] +" ");
		
		}
		int suma = listarotada[0] + listarotada[1] + listarotada[2];
		System.out.println("La suma es: " +suma);
		
		
		if (suma % 2 == 0) {
			System.out.println("Nivel de Estabilidad: Estable");
			} else {
			System.out.println("Nivel de Estabilidad: Inestable");	
			}
		
		sc.close();
	  }
	}


