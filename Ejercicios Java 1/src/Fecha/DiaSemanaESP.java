package Fecha;

//Representa los días de la semana en Java.
import java.time.DayOfWeek;
//Para obtener la fecha y hora actual.
import java.time.LocalDateTime;
//Para formatear el nombre del día.
import java.time.format.TextStyle;
//Para establecer el idioma en español.
import java.util.Locale;

public class DiaSemanaESP {
	public static void main(String[] args) {
		// Obtener la fecha y hora actual.
		LocalDateTime fechaActual = LocalDateTime.now();

		// Obtener el día de la semana
		// (Ej: MONDAY, TUESDAY, etc.).
		DayOfWeek diaSemana = fechaActual.getDayOfWeek();

		// Convertir el día de la semana a texto en español.
		// - getDisplayName() - obtiene el nombre del día
		// en el idioma indicado.
		// - TextStyle.FULL - devuelve el nombre completo
		// del día (Ejemplo: "lunes", "martes").
		// - Locale.of("es", "ES") - establece el idioma
		// español.
		String nombreDia = diaSemana.getDisplayName(TextStyle.FULL, Locale.of("es", "ES"));

		// Mostrar el día de la semana en español.
		System.out.println("Hoy es " + nombreDia);
	}
}
