package ArrayDinamico;

import java.util.ArrayList;

public class ArrayDinamico1 {
	public static void main(String[] args) {
			// Declaramos un ArrayList para almacenar elementos
			// de tipo String.
			int numero = 4;
			ArrayList<String> arrayList = new ArrayList<>();
	 
			// Añadimos elementos al ArrayList…
	 
			// Añadimos cadena.
			arrayList.add("Eva");
			// Añadimos cadena de número.
			arrayList.add("123");
			// Añadimos número convertido a cadena.
			arrayList.add(String.valueOf(numero));
			
			arrayList.add("Adios");
	 
			// Recorremos colección con bucle for each.
			for (String elemento : arrayList) {
				System.out.println(elemento);
			}
			
			System.out.println("");
			//metodo .get() para obtener valores especificos del array
			for (String elemento2 : arrayList) {
				System.out.println(arrayList.get(2) +" "+arrayList.get(0));
			}
			//imprimes array
			System.out.println();
			System.out.println(arrayList);
			//.size es lo mismo que .length
			System.out.println();
			System.out.println("La matriz tiene " +arrayList.size() +" elementos.");
			
			System.out.println();
			for (int i = 0; i < arrayList.size() ; i++) {
				System.out.println("Elemento "+(i + 1) + " : " +arrayList.get(i));
			} 
				
			//.remove para eliminar elementos del array -
			arrayList.remove(2);
			System.out.println();
			System.out.println(arrayList);
			
			//metodo .set(lugar donde sera reemplazado, ELEMENTO)
			arrayList.set(1, "Pedro"
					+ "");
			System.out.println();
			System.out.println(arrayList);
			//verificar si contiene algo
			if(arrayList.contains("Pedro")) {
				System.out.println("Bienvenido");
			} else {
				System.out.println("No te conozco");
			}
			//vaciar array
			arrayList.clear();
			if (arrayList.size() == 0){
				System.out.println("La matriz esta vacía");
			}
			//lo mismo que arrayList.size() == 0
			if (arrayList.isEmpty()) {
				
			}
	}
}

