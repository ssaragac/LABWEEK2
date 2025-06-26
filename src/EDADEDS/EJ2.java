package EDADEDS;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos años tienes?:");
        int age;
        age = scanner.nextInt();

        if (age < 6 || age > 120) {
            System.out.println("Edad no válida.");
        } else if (age >= 6 && age <= 11) {
            System.out.println("Estás en Primaria.");
        } else if (age >= 12 && age <=17) {
            System.out.println("Estás en Secundaria");
        } else if (age >=18 && age <=23) {
            System.out.println("Estás en la Universidad.");
        } else {
            System.out.println("Estás trabajando.");
        }

        scanner.close();
    }
}