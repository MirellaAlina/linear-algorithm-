package ar.com.ada.online.second.exercisefour;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Un estacionamiento requiere determinar el cobro que debe
        // aplicar a las personas que lo utilizan.
        // Considere que el cobro es con base en las horas que
        // lo disponen y que las fracciones de hora se toman como
        // completas

        System.out.println("Programa que determina el costo del estacionamiento");
        int hoursUsed;
        double hourlyValue;
        double parkingValue;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese el valor por hora del parking: ");
        hourlyValue = keyboard.nextDouble();

        System.out.print("Ingrese las horas que estuvo estacionado,\nlas fracciones de hora cuentan como una hora entera: ");
        hoursUsed = keyboard.nextInt();

        parkingValue = hourlyValue * hoursUsed;

        System.out.println("El valor del estacionamiento es de : $" + parkingValue);






    }
}
