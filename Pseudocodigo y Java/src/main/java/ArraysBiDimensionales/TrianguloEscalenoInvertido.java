package ArraysBiDimensionales;

public class TrianguloEscalenoInvertido {

	public static void main(String[] args) {
        int altura = 10; // Puedes cambiar el valor de la altura para obtener un triángulo más grande o más pequeño

        // Bucle para imprimir cada fila del triángulo
        for (int i = 0; i < altura; i++) {
            // Imprimir los espacios antes de los asteriscos
            for (int j = 0; j < i; j++) {
                System.out.print(" "); // Espacio en blanco
            }

            // Imprimir los asteriscos
            for (int k = 0; k < (altura - i); k++) {
                System.out.print("*"); // Asterisco
            }

            // Mover a la siguiente línea
            System.out.println();
        }
    }
	
}
	


