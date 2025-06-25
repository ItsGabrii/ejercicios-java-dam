package Fecha;

//Para obtener la fecha y hora actual.
import java.time.LocalDateTime;
//Para formatear el nombre del mes.
import java.time.format.TextStyle;
//Para establecer el idioma en español.
import java.util.Locale;

public class Fecha {
	public static void main(String[] args) {
		// Obtener la fecha y hora actual.
		LocalDateTime fechaActual = LocalDateTime.now();

		// Obtener el día del mes como un número entero.
		int dia = fechaActual.getDayOfMonth();

		// Obtener el nombre del mes en español.
		// - getMonth() - devuelve un objeto Month
		// (Ejemplo: JANUARY, MARCH...).
		// - getDisplayName() - convierte ese mes a texto
		// en el idioma especificado.
		// - TextStyle.FULL - obtiene el nombre completo
		// del mes (Ejemplo: "febrero").
		// - Locale.of("es", "ES") establece el idioma
		// español.
		String mes =
				fechaActual.getMonth().getDisplayName(
						TextStyle.FULL,
						Locale.of("es", "ES"));

		// Obtener el año como un número entero
		int anio = fechaActual.getYear();

		// Mostrar la fecha formateada con el nombre del mes
		// en español.
		System.out.println(
				"Hoy es " + dia +
				" de " + mes +
				" de " + anio);
	}
}