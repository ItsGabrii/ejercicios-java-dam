package EjerciciosObjetos;

public class Libro {
	
	private String autor;
	private String titulo;
	private int paginas;
	
	public Libro () {
		this.titulo = "Desconocido";
		this.autor = "Desconocido";
		this.paginas = 100;
		
	}
		
	public Libro (String titulo) {
		this.titulo = titulo;
		this.autor = "Desconocido";
		this.paginas = 100;
		

	}
	
	public Libro (String titulo,String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = 100;
		
	}
	
	public Libro (String titulo, String autor, int paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		
	}
	
	public void mostrarDatos() {
		System.out.println("Título: " +this.titulo);
		System.out.println("Autor: " +this.autor);
		System.out.println("Páginas: " +this.paginas);
		System.out.println("---------------------------"); 
	}
	

	
}
