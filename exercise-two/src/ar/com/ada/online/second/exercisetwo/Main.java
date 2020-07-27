package ar.com.ada.online.second.exercisetwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Programa que suma dos números dados");
        // defino las variables
        int firstQualification;
        int secondQualification;
        int thirdQualification;
        int fourthQualification;
        double average;

        // habilito el ingreso de datos por el teclado
        Scanner keyboard = new Scanner(System.in);

        // leo los datos del usuario
        System.out.print("Ingrese la primera calificacion: ");
        firstQualification = keyboard.nextInt();

        System.out.print("Ingrese la segunda calificacion: ");
        secondQualification = keyboard.nextInt();

        System.out.print("Ingrese la tercera calificacion: ");
        thirdQualification = keyboard.nextInt();

        System.out.print("Ingrese la cuarta calificacion: ");
        fourthQualification = keyboard.nextInt();

        // realizo el proceso y lo guardo en la variable result
        average = ((firstQualification + secondQualification + thirdQualification + fourthQualification)/ 4);

        // muestro el resultado por pantalla
        System.out.println("El resultado es: " + average);
    }
}
