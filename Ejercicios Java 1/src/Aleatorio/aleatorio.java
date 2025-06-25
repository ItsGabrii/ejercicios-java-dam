package Aleatorio;

public class aleatorio {
	public static void main(String[] args) {
		//ALEATORIO
		double aleatorio;
		aleatorio =  (int)(Math.random()*5);
		System.out.println(aleatorio);
		//ALEATORIO ENTRE 1 Y X
		double aleatorio2;
		aleatorio2 =  (int)(Math.random()*5 + 1);
		System.out.println(aleatorio2);
		// ALEATORIO ENTRE X E Y (x = VALOR MAXIMO) (y = VALOR MINIMO)  MATH.RANDOM() * (VALOR MAXIMO - VALOR MINIMO + 1) + VALOR MINIMO
		double aleatorio3;
		aleatorio3 =  (int)(Math.random()*(15 - 10 + 1)  + 10);
		System.out.println(aleatorio3);
	}

}
