package ar.com.ada.online.second.exercisetwelve;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// algoritmo para determinar cuánto pagará
        // finalmente una persona por un artículo equis,
        // considerando que tiene un descuento de 20%,
        // y debe pagar 15% de IVA (debe mostrar el precio con
        //descuento y el precio final).

        System.out.println("Determinar cuanto pagará una persona");

        double price;
        double discount = 0.20;
        double iva = 0.15;
        double priceWithDiscount;
        double priceWithIva;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("ingrese el valor del articulo: $");
        price = keyboard.nextDouble();

        priceWithDiscount = price - (price * discount);
        System.out.println("El precio con descuento es de : $" + priceWithDiscount);

        priceWithIva = priceWithDiscount + (price * iva);
        System.out.println("El precio con IVA es de: $" + priceWithIva);





    }
}
