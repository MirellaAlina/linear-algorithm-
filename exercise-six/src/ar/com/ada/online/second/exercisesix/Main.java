package ar.com.ada.online.second.exercisesix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// requiere determinar la hipotenusa de un triángulo rectángulo.
        // ¿Cómo sería el programa que representen el algoritmo
        // para obtenerla? Recuerde que por Pitágoras se tiene que:
        // C^2= A^2 + B^2 .

        System.out.println("Programa para determinar la hippotenusa de un triángulo rectángulo");

        double legOne;
        double legTwo;
        double hypotenuse;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la medida del cateto 1: ");
        legOne = keyboard.nextDouble();

        System.out.print("Ingrese la medida del cateto 2: ");
        legTwo = keyboard.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(legOne, 2) + (legTwo * legTwo));

        System.out.print("La hipotenusa es: " + String.format("%.2f", hypotenuse));
    }
}
