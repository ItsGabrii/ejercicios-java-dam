
package Cadenas;

public class Trim_toUpperCase_toLowerCase {

	public static void main(String[] args) {
		String cadena = "             Nevera               ";
		String Espacios = cadena.trim();
		String mayus = cadena.toUpperCase();
		String minus = cadena.toLowerCase();
				
		System.out.println("La " +cadena + " esta limpia");
		System.out.println("Con TRIM: " +"La " +Espacios +" esta limpia");
		System.out.println("MAYUS: " +mayus);
		System.out.println("minus: " +minus);

	}

}
