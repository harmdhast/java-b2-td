package td01;


import java.util.Scanner;


public class ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre positif : ");
        int value = scanner.nextInt();

        if (value < 0) {
            System.out.println("Le nombre n'est pas positif.");
            System.exit(0);
        }

        System.out.println("Vous avez entré " + value);


        for (int i = 0; i < 13; i++) {
            System.out.println(value + " x " + i + " = " + value * i);
        }

        System.out.println("La factorielle de " + value + " est " + factorial(value));

    }

    public static int factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
