package EjerciciosObjetos;

import java.util.Scanner;

public class Calculos {
	// METODOS //
	public double precioFinal(double precio, int descuento) {
		double descuentoAplicado = (descuento * precio)/100;
		double precioConDescuento = precio - descuentoAplicado;
		double preciofinal = precioConDescuento * 1.21 /*IVA*/;
		return preciofinal;
	}
	
	public void array(int[]array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	
	
	
	// -------------------------------------------------------------------------------------------------------------------//

	public static void main(String[] args) {
		
		Calculos calculo = new Calculos();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el precio de tu producto");
		double precio = sc.nextDouble();
		System.out.println("Ahora dame el descuento del producto");
		int descuento = sc.nextInt();
		
		System.out.println("El precio final del producto con el descuento aplicado del " + descuento + " es: " + calculo.precioFinal(precio, descuento));
		
		
		int [] array = new int [10];
		System.out.println("Dame 10 valores para meterlos en el array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		calculo.array(array);
		
		sc.close();
		
	}

}
