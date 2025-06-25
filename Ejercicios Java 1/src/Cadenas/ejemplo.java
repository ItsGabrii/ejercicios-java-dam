package Cadenas;

public class ejemplo {

	public static void main(String[] args) {
		// Cadena con espacios a los ladosString palabra = "   nevera   ";         // Mostrar la cadena con espacios concatenada con otras        System.out.println("Antes de trim: '" + palabra + "' concatenada con ' es un electrodoméstico.'");                 // Aplicar trim para eliminar espacios al inicio y al finalString palabraLimpia = palabra.trim();         // Mostrar la cadena limpia System.out.println("Después de trim: '" + palabraLimpia + "' concatenada con ' es un electrodoméstico.'");

	}

}
