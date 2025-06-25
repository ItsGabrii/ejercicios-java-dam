package Objetos;

import paquete.Mensajes;

public class Inicio {

	public static void main(String[] args) {
		//creamos el objeto mensajes 
		Mensajes mensajes = new Mensajes();
		//Llamamos a los metodos del archivo Mensajes.java mediante el objeto mensajes
		mensajes.saludo();
		mensajes.despedida();

	}

}
