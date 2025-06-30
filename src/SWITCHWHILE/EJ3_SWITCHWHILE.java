package SWITCHWHILE;

import java.util.Scanner;

public class EJ3_SWITCHWHILE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seguir;

        do {
            System.out.println("¿Qué sonido quieres escuchar?");
            System.out.println("1 - Cohete");
            System.out.println("2 - Gato");
            System.out.println("3 - Moto");
            System.out.println("4 - Timbre");

            while (!scanner.hasNextByte()) {
                System.err.println("Por favor, introduce un número del 1 al 4.");
                scanner.next();
            }

            byte opcion = scanner.nextByte();
            scanner.nextLine(); // limpiar el buffer

            boolean opcionValida = false;

            switch (opcion) {
                case 1:
                    System.out.println("Ziuuuuum!");
                    opcionValida = true;
                    break;
                case 2:
                    System.out.println("Miauuu!");
                    opcionValida = true;
                    break;
                case 3:
                    System.out.println("Brrrrmmm!");
                    opcionValida = true;
                    break;
                case 4:
                    System.out.println("DING DONG!");
                    opcionValida = true;
                    break;
                default:
                    System.err.println("Ese sonido no está disponible.");
            }

            if (opcionValida) {
                System.out.print("¿Quieres escuchar otro? (sí/no): ");
                seguir = scanner.nextLine().toLowerCase();
            } else {
                seguir = "sí"; // vuelve a intentarlo si puso opción no válida
            }

        } while (seguir.equals("sí") || seguir.equals("si"));

        System.out.println("Fin del archivo sonoro.");
        scanner.close();
    }
}