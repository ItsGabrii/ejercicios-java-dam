package EjerciciosObjetos;

import java.util.Scanner;

public class InicioCoche {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coche coche = new Coche();
		int marcha = 0;
		int velocidad = 0;
		int frenar = 0;
		
		
		while (true) {	
		System.out.println("¿Desea encender el coche? (s/n)");
		String opcion = sc.nextLine();
		
		if (!opcion.equals("s") && !opcion.equals("n")) {
			System.out.println("No le entendi, pruebe de nuevo");
			continue;
		} 
		if (opcion.equals("s")) {
			coche.encender();
			System.out.println("Coche encencido");
			coche.salpicadero();
			
		System.out.print("¿Cuantos km/h desea acelerar?: ");
		velocidad = sc.nextInt();
		coche.acelerar(velocidad);//envio los datos al metodo 
		System.out.println("¿Cuantos km/h desea frenar?: ");
		frenar = sc.nextInt();
		coche.frenar(frenar);
		coche.salpicadero();//muestro el estado
		}
		
		break;
	}

		System.out.println("Coche apagado. Fin del programa");
		
		
	
		sc.close();
	}	

}
