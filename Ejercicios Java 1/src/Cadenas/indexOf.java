package Cadenas;

public class indexOf {
	public static void main(String[] args) {
		String cadena = "primer programa de productos.";
 
		int posicion1 = 0;
		int posicion2 = 0;
		int posicion3 = 0;
 
		posicion1 = cadena.indexOf("p");
		posicion2 = cadena.indexOf("p" , posicion1 + 1);
		posicion3 = cadena.indexOf("p" , posicion2 + 1);
		
		System.out.println("Primera ubicación: " + posicion1);
		System.out.println("Segunda ubicación: " + posicion2);
		System.out.println("Tercera ubicación: " + posicion3);
	}

}
