package Fecha;

//Importamos LocalDateTime.
import java.time.LocalDateTime;

//Importamos DateTimeFormatter para dar formato
//a fecha y hora.
import java.time.format.DateTimeFormatter;

public class DarFormato {
	public static void main(String[] args) {
		// Obtener la fecha y hora actual.
		LocalDateTime fechaActual = LocalDateTime.now();

		// Crear un formato personalizado para fecha y hora.
		// - dd/MM/yyyy → Día, mes y año (formato europeo).
		// - HH:mm:ss → Hora en formato 24 horas.
		DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		// Ejecujamos el método format del objeto LocalDateTime
		// y le pasamos como argumento nuestra fecha formateada.
		// Lo almacenamos en variable String.
		String fechaFormateada = fechaActual.format(formatoFechaHora);

		// Mostrar fecha y hora formateada.
		System.out.println(fechaFormateada);
	}
}