package ar.com.ada.online.second.exerciseeleven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// La compañía de luz y sombras (CLS) requiere
        // determinar el pago que debe realizar una
        //persona por el consumo de energía eléctrica,
        // la cual se mide en kilowatts (KW).

        System.out.println("\nPrograma que determina el pago a realizar por el servicio de energia ");

        double payment;
        double kwConsumed;
        double valueKw;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("ingrese el valor del KW: $");
        valueKw = keyboard.nextDouble();
        System.out.print("ingrese los KW consumidos: ");
        kwConsumed = keyboard.nextDouble();

        payment = valueKw * kwConsumed;

        System.out.print("El pago a relizar es: $" + payment);
    }
}
