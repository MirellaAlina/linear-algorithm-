package ar.com.ada.online.second.exercisetwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Una empresa importadora desea determinar
        // cuántos dólares puede adquirir con equis
        //cantidad de dinero mexicano. programa que
        //representen el algoritmo para tal fin.

        System.out.println("Programa para convertir pesos mexicanos a dólares");
        // defino las variables
        double dollarAmount;
        double mexicanPesoAmount;
        final double DOLLAR_PRICE = 22.28 ;

        // habilito el ingreso de datos por el teclado
        Scanner keyboard = new Scanner(System.in);

        // leo los datos del usuario
        System.out.print("Ingrese la cantidad de pesos mexicanos que desea convertir: ");
        mexicanPesoAmount = keyboard.nextDouble();

        // realizo el proceso y lo guardo en la variable dollarAmount
        dollarAmount = (mexicanPesoAmount / DOLLAR_PRICE);

        // muestro el resultado en pantalla
        System.out.print("La cantidad de dólares que puede adquirir son: u$s" + dollarAmount);


    }
}
