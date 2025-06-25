package org.pseudocodigo;

public class ParImpar1a100 {

	public static void main(String[] args) {
		int contador=0;
		for(int i = 1; i<= 100; i++) {
			if(i % 2 !=0) {
				contador++;
				System.out.println(i);
			}
		}
		
		System.out.println("los numeros impares del 1 al 100 son los siguientes: " +contador);


	}

}
