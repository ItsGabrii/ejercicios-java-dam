package Aleatorio;

public class Primitiva {
		public static void main(String[] args) {
			
			int [] primitiva= new int [6];
			int reintegro = (int)(Math.random()*9);
			boolean devolver = false;
			
			
			System.out.println("Primitiva:");
			for (int i = 0; i < primitiva.length; i++) {
				primitiva[i]= (int)(Math.random()*49 + 1);
				
				System.out.println(primitiva[i]);
			}
			
			System.out.println("Reintegro: "+reintegro);
			
			for (int i = 0; i < primitiva.length; i++) {
				if (reintegro == primitiva [i]) {
					devolver = true;
					break;
				}
			}
			
			if(devolver) {
				System.out.println("Se te devuelve el dinero");
			} else {
				System.out.println("No se te devuelve el dinero");
			}
		}
			
		
			
			
	}

