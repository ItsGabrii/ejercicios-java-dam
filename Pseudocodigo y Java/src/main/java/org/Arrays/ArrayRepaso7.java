package org.Arrays;

public class ArrayRepaso7 {

	public static void main(String[] args) {
		int[] lista = {21,34,12,41,34,43,56,76};
		int mayor = lista[0]; //inicializamos mayor en la posicion 0 de nuestro array (primer valor)
		for (int i = 0; i < lista.length; i++) { //recorremos array 
			if (lista[i] > mayor) { //comparamos los valores de nuestro array 
				
				mayor = lista[i]; //asignamos el numero más alto de nuestro array
				
			}
			
		}
		int Segundomayor = lista[0]; //inicializamos segundo mayor en la posicion 0 de nuestro array (primer valor) 
		for (int i = 0; i < lista.length; i++) { //recorremos array
			if (lista[i] > Segundomayor && lista[i] < mayor) { /*si el numero es mas grande que el más pequeño 
																y a su vez es más pequeño que el más grande 
																entonces es el segundo valor más grande */
				
				Segundomayor = lista[i]; //asignamos segundo número mas alto de nuestro array 
			
			}
		}
		System.out.println("El número mayor es: " +mayor); //imprimimos el número mas alto
		System.out.println("El segundo número mayor es: " +Segundomayor); //imprimimos el segundo número mas alto
	}

}
