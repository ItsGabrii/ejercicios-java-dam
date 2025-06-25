package Fecha;

//Importamos LocalDateTime.
import java.time.LocalDateTime;

public class Hora {
	public static void main(String[] args) {
		// Obtener la fecha y hora actual.
		LocalDateTime fechaActual = LocalDateTime.now();

		// Obtener la hora, minutos y segundos directamente...
		// Obtiene la hora en formato 24h.
		int hora = fechaActual.getHour();

		// Obtiene los minutos.
		int minuto = fechaActual.getMinute();

		// Obtiene los segundos.
		int segundo = fechaActual.getSecond();

		// Mostrar la hora actual en formato HH:MM:SS.
		System.out.println(
				"Hora actual: " +
				hora + ":" + minuto + ":" + segundo);
	}
}
