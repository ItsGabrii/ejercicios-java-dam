package Cadenas;

public class Ej2 {

	public static void main(String[] args) {
		
		String cadena = "Hola Alba";
		
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println("Posición "+ i + "... " + " Carácter: " + cadena.charAt(i));
		}
		
		String nombre = "Eva";
		int sueldo = 1500;
		int edad = 23;
		String cad = String.format("Hola %s, tienes %d años y ganas %d €/mes", nombre, edad, sueldo);
		System.out.println(cad);
	}

}

