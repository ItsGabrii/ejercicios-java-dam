package Menu;

import java.util.ArrayList;
import java.util.Scanner;
 
public class Menu {
	public static void main(String[] args) {
		// Declaraciones.
		int opcion = 0;
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> miColeccion = new ArrayList<>();
 
		// Menú de opciones.
		while (opcion != 5) {
			System.out.println();
			System.out.println("================");
			System.out.println("MENÚ DE OPCIONES");
			System.out.println("================");
			System.out.println("1. AÑADIR ELEMENTO");
			System.out.println("2. LISTAR ELEMENTOS");
			System.out.println("3. ELIMINAR ELEMENTO");
			System.out.println("4. LIMPIAR COLECCIÓN");
			System.out.println("5. SALIR");
			System.out.println();
 
			// Leer la entrada como cadena.
			System.out.print("INTRODUCIR OPCIÓN: ");
			String input = scanner.nextLine();
 
			// Convertir la entrada a entero.
			// (Opción inválida si no es número).
			try {								 
				opcion = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println(
						"ERROR: DEBE INTRODUCIR NÚMERO VÁLIDO.");
				// Evitar que el switch procese una opción
				// no válida.
				// Sin esta asignación, si el usuario introduce
				// algo inválido (por ejemplo, texto no numérico),
				// el valor de opcion no se modifica y mantiene
				// vfg su valor anterior.
				opcion = -1;
			}
 
			// Procesar la opción seleccionada.
			switch (opcion) {
				case 1:
					System.out.print(
							"INTRODUCIR ELEMENTO A AÑADIR: ");
					String elementoAAgregar = scanner.nextLine();
					miColeccion.add(elementoAAgregar);
					System.out.println("ELEMENTO AÑADIDO.");
					break;
				case 2:
					if (miColeccion.isEmpty()) {
						System.out.println(
                                              "NO HAY ELEMENTOS QUE MOSTRAR.");
					} else {
						System.out.println(
                                              "ELEMENTOS DE LA COLECCIÓN:");
						for (String elemento : miColeccion) {
							System.out.println("- " + elemento);
						}
					}
					break;
				case 3:
					System.out.print("INTRODUCIR ELEMENTO A ELIMINAR: ");
					String elementoAEliminar = scanner.nextLine();
 
					if (miColeccion.remove(elementoAEliminar)) {
						System.out.println("ELEMENTO ELIMINADO.");
					} else {
						System.out.println(
							"ELEMENTO NO ENCONTRADO EN COLECCIÓN.");
					}
					break;
				case 4:
					miColeccion.clear();
					System.out.println("COLECCIÓN LIMPIADA.");
					break;
				case 5:
					System.out.println("PROGRAMA FINALIZADO.");
					break;
				default:
					System.out.println("OPCIÓN NO VÁLIDA.");
					break;
				}
		}
		scanner.close();
	}
}