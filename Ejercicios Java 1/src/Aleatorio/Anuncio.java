package Aleatorio;



public class Anuncio {

	public static void main(String[] args) {
		
		String [] anuncios = {"Movistar", "Colgate", "Fanta", "Lacasitos", "Fairy"};
		
		int indiceAnuncios = (int) (Math.random() * anuncios.length);
		
		System.out.println("Anuncio: " +anuncios[indiceAnuncios]);
		
		}
	}


