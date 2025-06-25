package Aleatorio;

public class Quiniela2 {

	public static void main(String[] args) {
		StringBuilder Quiniela = new StringBuilder();
		byte variantes = 0;
		
		for (int i = 1; i <= 14; i++) {
			
			int Azar = (int) (Math.random() * 6 + 1);
			
			switch (Azar){
			
			case 1:
			case 2:
			case 3:
				Quiniela.append(1);
				break;
			case 4:
			case 5:
				Quiniela.append("\tX");
				variantes++;
			case 6:
				Quiniela.append("\t\t2");
				variantes++;
				break;
			}
			if (i != 14) {
				Quiniela.append("\n");
			}
		}
		
		System.out.println("QUINIELA GENERADA: ");
		System.out.println();
		System.out.println(Quiniela);
		System.out.println();
		System.out.println("La quiniela tiene " + variantes + " variantes.");

	}

}
