package ar.com.ada.online.second.exerciseeight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Se requiere determinar el tiempo que tarda
        // una persona en llegar de una ciudad a otra
        // en bicicleta, considerando que lleva una velocidad constante

        System.out.println("cuanto se tarde en llegar de una cuidad a otra?");

        double timeOfArrival;
        final double SPEED;
        double distance;
        final double DEPARTURE = 0;
        double arrival;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la velocidad a la que se moverá: ");
        SPEED = keyboard.nextDouble();

        System.out.print("Ingrese a cuántos km está la cuidad de llegada: ");
        arrival = keyboard.nextDouble();

        distance = arrival - DEPARTURE;
        System.out.println("La distancia a recorrer en km es de: " + distance);

        timeOfArrival = distance / SPEED;

        System.out.println("El tiempo que tardará en llegar es: " + timeOfArrival);










    }
}
