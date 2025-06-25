package EjerciciosObjetos;

public class Calculos2 {

	public int suma (int num1, int num2) {
		int Suma = num1 + num2;
		return Suma;
	}
	
	public int suma (int num2, int num1, int num3) {
		int Suma = num2 + num1 + num3;
		return Suma;
	}
	
	public int suma (int num4, int num3, int num2, int num1) {
		int Suma = num4 + num3 + num2 + num1;
		return Suma;
	}
	
	public int  suma( int [] matriz) {	
		int suma = 0;
		
		for (int i = 0; i < matriz.length; i++) {	
			 suma += matriz[i];
		}
		
		return suma;
	}
}
