package ar.com.ada.online.second.exerciseten;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// La CONAGUA requiere determinar el pago que
        // debe realizar una persona por el total de
        //metros cúbicos que consume de agua.

        System.out.println("Programa que determina el pago de una persona por el consumo");

        double valuePerM3;
        double totalM3Consumed;
        double payment;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("ingrese el valor por metro cubico de agua: $");
        valuePerM3 = keyboard.nextDouble();

        System.out.print("ingrese el total de metros cubicos consumidos: ");
        totalM3Consumed = keyboard.nextDouble();

        payment = valuePerM3 * totalM3Consumed;

        System.out.println("El pago a realizar es de: $" + payment);
    }
}
