package ar.com.ada.online.second.exercisethree;

import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     // Una empresa que contrata personal requiere determinar la edad de las personas que
        // solicitan trabajo, pero cuando se les realiza la entrevista
        // sólo se les pregunta el año en que nacieron.


        System.out.println("Programa para determinar la edad de los solicitantes al empleo");
        // defino las variables
        int yearOfBirth;
        int thisYear;
        int age;

        // inicializo la variable thisYear tomando la
        //fecha de la OS donde corre la JVM
        thisYear = Year.now().getValue();

        // habilito el ingreso de datos por el teclado
        Scanner keyboard = new Scanner(System.in);

        // leo los datos del usuario
        System.out.print("Ingrese el año de nacimiento: ");
        yearOfBirth = keyboard.nextInt();

        // realizo el proceso y lo guardo en la variable age
        age = (thisYear - yearOfBirth);

        // muestro el resultado por pantalla
        System.out.print("La edad del solicitante es " + age);







    }
}
