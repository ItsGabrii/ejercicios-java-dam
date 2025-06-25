package Cadenas;

public class SubString {

	public static void main(String[] args) {
		// Cadena.
		String cadena = "El lenguaje Java";
 
		// Obtenemos subcadena desde el carácter 12
		// hasta el final.
		String subcadena1 = cadena.substring(12);
 
		// Obtenemos subcadena desde el carácter 3
		// hasta el 11.
		String subcadena2 = cadena.substring(3, 11);
 
		// Mostramos subcadenas obtenidas.
		System.out.println(subcadena1);
		System.out.println(subcadena2);
	}

}
