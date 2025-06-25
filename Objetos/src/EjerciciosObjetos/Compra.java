package EjerciciosObjetos;

import java.util.Scanner;

public class Compra {

	private  int codigoProducto;
	private double precio;
	private int descuento;
	
	public Compra(int codigoProducto, double precio, int descuento) {
		
		this.codigoProducto = codigoProducto;
		this.precio = precio;
		this.descuento = descuento;
		
	}
	
	public double Precio() {
		double calcularDescuento = (this.descuento * this.precio) / 100;
		double precioFinal = this.precio - calcularDescuento;
		return precioFinal;
	}
	
	
	
	public void mostrarInfo() {
		System.out.println("DATOS DE LA COMPRA...");
		System.out.println("Código: " + codigoProducto);
		System.out.println("Precio: " + precio + "€");
		System.out.println("Descuento: " + descuento + "%");
		System.out.println("Precio Final: " + Precio() +"€");
	}
	
	// ---------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código Producto: ");
		int codigoProducto = sc.nextInt();
		
		System.out.print("Precio: ");
		double precio = sc.nextDouble();
		
		System.out.print("Descuento: ");
		int descuento = sc.nextInt();
		
		Compra compra = new Compra(codigoProducto, precio, descuento);
		
		compra.mostrarInfo();
		
		sc.close();
		
	}
	
	
}
