package ar.com.ada.online.second.exercisethirteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // algoritmo para determinar cuánto dinero
        // ahorra una persona en un año si considera
        // que cada semana ahorra 15% de su sueldo
        // (considere cuatro semanas por mes y que no cambia el
        //sueldo).

        System.out.println("Determinar ahorro");

        double salary;
        double weeklySavings;
        double annualSavings;
        double savingsPercentage = 0.15;
        int weeksPerMonth = 4;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("ingrese su salario: $");
        salary = keyboard.nextDouble();

        weeklySavings = salary * savingsPercentage;
        System.out.println("Ud ahorra semanalmente: $" + weeklySavings);

        annualSavings = (weeklySavings * weeksPerMonth) * 12;
        System.out.println("Ud ahorra anualmente: $" + annualSavings);
    }
}
