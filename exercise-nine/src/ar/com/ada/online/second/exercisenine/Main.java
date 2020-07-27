package ar.com.ada.online.second.exercisenine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Programa que determina el costo de una llamada telefonica");

        // Defino las variables
        int callCost;
        int callDuration;
        int costPerMinute;

        // Habilito el ingreso de datos por el teclado
        Scanner keyboard = new Scanner(System.in);

        // Se leen los datos que se ingresan
        System.out.print("Ingrese el costo por minuto:$ ");
        costPerMinute = keyboard.nextInt();

        System.out.print("Ingrese los minutos que duró la llamada: ");
        callDuration = keyboard.nextInt();

        // Se realiza el proceso de calcular el costo de la llamada
        callCost = (costPerMinute * callDuration);

        // Muestra el resultado por pantalla
        System.out.print("El costo de la llamada es:$ " + callCost);



    }
}
