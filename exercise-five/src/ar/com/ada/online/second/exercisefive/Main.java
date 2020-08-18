package ar.com.ada.online.second.exercisefive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Pinturas “La brocha gorda” requiere determinar cuánto cobrar
        // por trabajos de pintura. Considere que se cobra por m2 y
        // realice un programa que representen el algoritmo que
        // le permita ir generando presupuestos para cada cliente.

        System.out.println("Programa para determinar presupuesto de pintura");
        double squareMeter;
        double longWall;
        double tallWall;
        double price;
        double budget;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el largo de la pared: ");
        longWall = keyboard.nextDouble();

        System.out.print("Ingrese el alto de la pared: ");
        tallWall = keyboard.nextDouble();

        squareMeter = (longWall * tallWall);
        System.out.println("metros cuadrados a pintar: " + squareMeter);

        System.out.print("Ingrese el valor del metro cuadrado: ");
        price = keyboard.nextDouble();

        budget = price * squareMeter;
        System.out.println("El presupuesto es: $" + budget);
    }
}
