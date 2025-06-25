package arrays;
import java.util.Arrays;
public class OrdenarMatriz {

		public static void main(String[] args) {
			int[] matriz = {34, 7, 23, 32, 5, 62};
			int buscado = 23;
			System.out.println("Matriz desordenada");
			for (int i = 0; i < matriz.length; i++) {
				System.out.print(matriz[i] + " ");
			}
			
			Arrays.sort(matriz);
			
			int pos = Arrays.binarySearch(matriz, buscado);
			
			System.out.println();
			System.out.println("Matriz ordenada");
			
			for (int i = 0; i < matriz.length; i++) {
				System.out.print(matriz[i] + " ");
			}
			
			System.out.println();
			if (pos >= 0) {
				System.out.println("El número " +buscado +" se encuentra en la posición: "+pos);
			} else {
				System.out.println("El número no existe");
			}
		
		}
}
