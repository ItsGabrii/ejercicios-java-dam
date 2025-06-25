package arrays3d;

public class Ej2 {
	public static void main(String[] args) {
		int Portal = 3;
		int Pisos = 5;
		int Puertas = 5;
		int [][][] urbanizacion= new int[Portal][Pisos][Puertas];
		int numPuerta;
		
		for (int i = 0; i < urbanizacion.length; i++) {
			//pisos
			for (int j = 0; j < urbanizacion[i].length; j++) {
				numPuerta = 111 + (i*100) +(j*10);
				//puertas
				for(int k = 0; k < urbanizacion[i][j].length; k++) {
					urbanizacion[i][j][k] = numPuerta++;
				}
			}
		}
					
		//imprimes
		System.out.println("PUERTAS DE LA URBANIZACIÓN: ");
		//portales
		for (int i = 0; i < urbanizacion.length; i++) {
			//pisos
			for (int j = 0; j < urbanizacion[i].length; j++) {
				//puertas
				for(int k = 0; k < urbanizacion[i][j].length; k++) {
					
			System.out.println("Portal " + (i+1)+", Piso " +(j+1)+ ", Puerta "+(k+1)+": "+(urbanizacion[i][j][k]));
					
			}
		}
	}
  }

}

