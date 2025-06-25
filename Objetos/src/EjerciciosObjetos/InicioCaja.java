package EjerciciosObjetos;


import java.util.Scanner;

public class InicioCaja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduzca el ancho: ");
		int ancho = sc.nextInt();
		
		System.out.print("Introduzca el largo: ");
		int largo = sc.nextInt();
		
		System.out.print("Introduzca el alto: ");
		int alto = sc.nextInt();
		
		Caja caja = new Caja(ancho, largo, alto);
		
		caja.DatosRecogidos();
		
		caja.CajaConstruida();
		
		System.out.println("Superficie: " + (double)caja.getSuperficie(largo, ancho));
		System.out.println("Volumen: " + (double)caja.getVolumen(largo, ancho, alto));
		
		System.out.println("Elementos actualmente: " +caja.getElementos());
		
		System.out.print("Introduzca elementos a insertar: ");
		int elemento = sc.nextInt();
		
		caja.addElementos(elemento);
		
		sc.close();
		
	}

}
