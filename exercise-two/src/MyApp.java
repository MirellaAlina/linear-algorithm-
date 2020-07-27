import javafx.scene.transform.Scale;

import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa que calcula el promedio de 4 calificaciones");

        // defino las variables
        int firstQualification;
        int secondQualification;
        int thirdQualification;
        int fourthQualification;
        float average;

        // habilito el ingreso de datos por el teclado
        Scanner keyboard = new Scanner(System.in);

        // se leen los datos que ingresa el usuario
        System.out.print("Ingrese la primer calificación: ");
        firstQualification = keyboard.nextInt();

        System.out.print("Ingrese la segunda calificación: ");
        secondQualification = keyboard.nextInt();

        System.out.print("Ingrese la tercer calificación: ");
        thirdQualification = keyboard.nextInt();

        System.out.print("Ingrese la cuarta calificación: ");
        fourthQualification = keyboard.nextInt();

        // realizo el proceso y se guarda en la variable average
        average = ((firstQualification + secondQualification + thirdQualification + fourthQualification) / 4);

        // muestro el resultado por pantalla
        System.out.print("El promedio es: " + average);
    }
}
