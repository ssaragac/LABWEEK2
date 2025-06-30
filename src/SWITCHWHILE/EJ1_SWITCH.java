package SWITCHWHILE;

import java.util.Scanner;

public class EJ1_SWITCH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es tu estación favorita? ");
        String estacion = scanner.nextLine().toLowerCase();

        switch (estacion) {
            case "primavera":
                System.out.println("La primavera me alteraaa.");
                return; // salimos del método
            case "verano":
                System.out.println("Calor y vacaciones.");
                return;
            case "otoño":
                System.out.println("La mejor estación del año.");
                return;
            case "invierno":
                System.out.println("Llega la navidad.");
                return;
            default:
                System.err.println("Eso no es una estación válida.");
        }

        scanner.close();
    }
}