package org.RepasoExamen;

import java.util.Scanner;

public class Repaso2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String objeto = ""; //definir variable objeto
        
        double precioTotal = 0.0; // contador del precio total de la lista que se mostrará al final de la lista cuando el usuario ponga PARAR

        System.out.println("Introduce tu compra (Escribe 'PARAR' para finalizar)");

        while (!objeto.equals("PARAR")) { //esto para decir igual con caracteres
            System.out.println("Dime cómo se llama el objeto:");
            objeto = sc.nextLine(); //esto para que lea un string

            if (objeto.equals("PARAR")) { /*Si objeto = Parar entonces que pare la lista */
                break;
            }

            System.out.println("Cantidad de ese objeto en el carrito:");
            int cantidad = sc.nextInt();

            System.out.println("Precio del objeto:");
            double precio = sc.nextDouble();

            // esto para limpiar una linea para que se vea bien
            sc.nextLine();

            double total = cantidad * precio;// con esto calculas el total
            precioTotal += total;
            System.out.println("Total: " + total);
        }
        System.out.println("Precio total: " +precioTotal);
        System.out.println("Lista terminada");
        sc.close();
    }
}
