package arrays3d;

public class Arrays3dEj1 {

	public static void main(String[] args) {
		int [][][] urbanizacion= {
					{ //PORTAL 1 (CADA PORTAL: 4 PISOS)
						{111,112,113,114,115}, // PISO 1 (CADA PISO: 5 PUERTAS)
						{121,122,123,124,125}, // PISO 2
						{131,132,133,134,135}, // PISO 3
						{141,142,143,144,145}, // PISO 4
					},
					
					{ //PORTAL 2
						{211,212,213,214,255},
						{221,222,223,224,225},
						{231,232,233,234,235},
						{241,242,243,244,245},
					},
					
					{ //PORTAL 3
						{311,312,313,314,355},
						{321,322,323,324,325},
						{331,332,333,334,335},
						{341,342,343,344,345},
					},
		};
		
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
