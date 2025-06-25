package EjerciciosObjetos;


public class Caja {
	
	private int ancho;
	private int largo;
	private int alto;
	private int elementos = 0;
	
	public Caja (int ancho, int largo, int alto) {
		this.ancho = ancho;
		this.largo = largo;
		this.alto = alto;
	}
	
	public int getAncho() {
		return this.ancho;
	}
	
	public int getLargo() {
		return this.largo;
	}
	
	public  int getAlto() {
		return this.alto;
	}
	
	public void DatosRecogidos() {
		System.out.println("Datos recogidos...");
		System.out.println("Ancho: " + this.ancho);
		System.out.println("Largo: " +this.largo);
		System.out.println("Alto: " +this.alto);
	}
	
	public void CajaConstruida() {
		System.out.println("CAJA CONSTRUIDA CORRECTAMENTE");
		System.out.println("Ancho: " +(double)this.ancho);
		System.out.println("Largo: " +(double)this.largo);
		System.out.println("Alto: " +(double)this.alto);
	}
	
	public int getVolumen(int largo, int ancho, int altura) {
		int Volumen = largo * ancho * altura;
		return Volumen;
	}
	
	public int getSuperficie (int largo, int ancho) {
		int Superficie = largo * ancho;
		return Superficie;
	}
	
	public int getElementos () {
			return this.elementos;
	}
	
	public void addElementos(int elementos) {
		this.elementos += elementos;
		
		System.out.println("Elementos actualmente: " + this.elementos);
	}
	
	

}

	
	
	
	


