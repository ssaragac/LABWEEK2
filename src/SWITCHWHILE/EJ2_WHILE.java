package SWITCHWHILE;

import java.util.Scanner;

public class EJ2_WHILE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int personasQueAyudaron = 0;
        double totalRecaudado = 0.0;

        System.out.print("¿Una ayudita? (sí/no): ");
        String respuesta = scanner.nextLine();

        while (respuesta.equals("sí") || respuesta.equals("si")) {
            System.out.print("¿Cuánto quieres aportar? ");
            while (!scanner.hasNextDouble()) {
                System.err.println("Por favor, introduce un número válido.");
                scanner.next();
            }
            double cantidad = scanner.nextDouble();
            scanner.nextLine(); // limpiar el buffer

            if (cantidad < 0) {
                System.err.println("La cantidad no puede ser negativa.");
            } else {
                personasQueAyudaron++;
                totalRecaudado += cantidad;
            }

            System.out.print("¿Una ayudita más? (sí/no): ");
            respuesta = scanner.nextLine();
        }

        System.out.println("Te deprimes y te vas para casa.");
        System.out.println("Personas que ayudaron: " + personasQueAyudaron);
        System.out.println("Total recaudado: " + totalRecaudado + " euros.");

        scanner.close();
    }
}