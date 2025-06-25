package Objetos;

public class Destino {
	
	//crear un metodo llamado mostrarMensaje que muestre un mensaje 
	//"este es un mensaje sin parametros"
	
	
	//los metodos tienen que ser lo mas generico posible 
	public void mostrarMensaje() {
		System.out.println("Este es un mensaje sin parametros");
	}
	
	public void saludarNombre(String nombre) {
		System.out.println("Hola " + nombre);
	}
	
	public void  Suma(int valor1, int valor2) {
		int suma = valor1 + valor2;
		System.out.println("La suma de " + valor1 + " y " + valor2 + " es: " + suma);
	}

	public int cuadrado (int valor3) {
		int potencia = valor3 * valor3;
		return potencia;
	}
	
	public int calcularPromedio (int numero, int numero2) {
		int promedio = numero + numero2 / 2;
		return promedio;
	}
}