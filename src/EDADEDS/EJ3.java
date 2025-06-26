package EDADEDS;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cómo se llama tu madre?:");
        String nomMama;
        nomMama = scanner.nextLine();

        System.out.println("¿Cúantos años tiene tu madre?:");
        int ageMama;
        ageMama = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Cómo se llama tu padre?:");
        String nomPapa;
        nomPapa = scanner.nextLine();

        System.out.println("¿Cúantos años tiene tu padre?:");
        int agePapa;
        agePapa = scanner.nextInt();

        double media = (agePapa + ageMama) / 2.0;

        System.out.println("Tu madre se llama " + nomMama + " y tiene " + ageMama + " años, " +
                "y tu padre se llama " + nomPapa + " y tiene " + agePapa + " años, " +
                "y la media de sus edades es " + media);

        scanner.close();
    }
}