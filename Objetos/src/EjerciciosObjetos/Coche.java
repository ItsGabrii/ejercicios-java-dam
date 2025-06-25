package EjerciciosObjetos;

public class Coche {
	private int velocidad;
	private int marcha;
	private boolean encendido;
	
	public Coche () {
		this.encendido = false;
		this.velocidad = 0;
		this.marcha = 0;
	}
	
	public int encender() {
		this.encendido = true;
		comprobarFrenos();
		comprobarAceite();
		comprobarNeumaticos();		
		return this.marcha = 1;
		
	}
	
	public boolean estaEncendido() {
		return this.encendido;
	}
	
	private String comprobarFrenos() {
		String cadena = "Comprobando frenos... OK";
		System.out.println(cadena);
		return cadena;
	}
	
	private String comprobarAceite() {
		String cadena = "Comprobando aceite... OK";
		System.out.println(cadena);
		return cadena;
	}
	
	private String comprobarNeumaticos() {
		String cadena = "Comprobando neumaticos... OK";
		System.out.println(cadena);
		return cadena;
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}
	
	public int getMarcha() {
		return this.marcha;
	}
	
	public void acelerar(int velocidad) {
		if(estaEncendido()) {
		this.velocidad += velocidad;
		subirMarcha();
		}
	}
	
	
	public void frenar(int frenar) {
	if (estaEncendido()) {
		
		if(frenar > this.velocidad) {
			this.velocidad = 0;
		} else {
			this.velocidad -= frenar;
			}
		bajarMarcha();
		}
	}
	
	public void subirMarcha() {
	if (estaEncendido()) {	
		if (this.velocidad >= 80 && this.marcha < 5) {
			this.marcha = 5;
		} else if (this.velocidad >= 60 && this.marcha < 4) {
			this.marcha = 4;
		}  else if (this.velocidad >= 40 && this.marcha < 3) {
			this.marcha = 3;
		}  else if (this.velocidad >= 20 && this.marcha < 2) {
			this.marcha = 2;
		}
					     }
	}
	
	public void bajarMarcha() {
	if (estaEncendido()) {
		if (this.velocidad < 20 && this.marcha < 1) {
			this.marcha = 1;
		} else if (this.velocidad < 40 && this.marcha < 2) {
			this.marcha = 2;
		}  else if (this.velocidad < 60 && this.marcha < 3) {
			this.marcha = 3;
		}  else if (this.velocidad < 80 && this.marcha < 4) {
			this.marcha = 4;
		}
				         }
	}
	
	
	public void salpicadero() {
		System.out.println("Estado del coche:");
		System.out.println("- Encendido: " +estaEncendido());
		System.out.println("- Velocidad: " +getVelocidad());
		System.out.println("- Marcha: " +getMarcha());
	}
	
	
}
