package ar.com.ada.online.second.exerciseseven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// La compañía de autobuses “La curva loca” requiere determinar
        // el costo que tendrá el boleto de un viaje sencillo,
        // esto basado en los kilómetros por recorrer y en el costo
        // por kilómetro.

        System.out.println("Programa que determina el costo del un boleto");

        double kilometerValue;
        double kmsToGo;
        double ticketCost;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el valor del kilómetro: $");
        kilometerValue = keyboard.nextDouble();

        System.out.print("Ingrese los kilómetros a recorrer: ");
        kmsToGo = keyboard.nextDouble();

        ticketCost = kilometerValue * kmsToGo;

        System.out.println("El costo del boleto es de : $" + ticketCost);
    }
}
