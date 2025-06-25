package EjerciciosObjetos;

public class Inicio3 {

	public static void main(String[] args) {
		
		Libro libros = new Libro();
		libros.mostrarDatos();
		
		Libro libros1 = new Libro("El Quijote");
		libros1.mostrarDatos();
		
		Libro libros2 = new Libro("Cien años de soledad", "Gabriel García Márquez");
		libros2.mostrarDatos();
		
		Libro libros3 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", 400);
		libros3.mostrarDatos();

	}

}
