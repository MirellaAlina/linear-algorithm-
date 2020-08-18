package ar.com.ada.online.second.exerciseone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // programa que representen el algoritmo para obtener
        // el área de un triángulo.

        System.out.println("Programa para determinar el área de un triángulo");
        // declaro las variables
        int height;
        int base;
        double area;

        // habilito ingreso de datos por el teclado
        Scanner keyboard = new Scanner(System.in);

        // leo los datos del usuario
        System.out.print("Ingrese la altura del triángulo: ");
        height = keyboard.nextInt();
        System.out.print("Ingrese la base del triángulo: ");
        base = keyboard.nextInt();

        // realizo el cálculo y guardo el resultado en variable area
        area = ((base * height)/2);

        // muestro el resultado en pantalla
        System.out.print("El área el triángulo es: " + area);
    }
}
