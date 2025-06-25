package org.Arrays;

public class Array3 {

	public static void main(String[] args) {
		int[] lista= {1,2,3,4,5,6}; //primer array
		int[] listainvertida= new int[lista.length]; /*nuevo array con la misma longitud que el primero 
																(esta vacio, sin valores)*/
		for (int i = 0; i < lista.length; i++) { //recorres array
			listainvertida[i] = lista[lista.length -1 -i]; //asi inviertes el orden
		}
		
		System.out.println("Lista: ");
		for (int i = 0; i < lista.length; i++) { //syso primer array
			System.out.println(lista[i]);
		} 
		
		System.out.println("Lista Invertida: ");
		for (int i = 0; i < lista.length; i++) { //syso segundo array
			System.out.println(listainvertida[i]);
		}
	
	}

}
