package td01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            System.out.print("Entrer un nombre entier x1 : ");
            int x1 = scanner.nextInt();
            System.out.print("Entrer un nombre entier x2 : ");
            int x2 = scanner.nextInt();

            System.out.println("x1 + x2 = " + (x1 + x2));
            System.out.println("x1 x x2 = " + (x1 * x2));

            for (int i = x1; i < x2; i++) {
                System.out.print(i + " ");
            }
            System.out.println(x2);

            System.out.println("Voulez vous continuer ? (oui/non)");
            running = scanner.next().equalsIgnoreCase("oui");
        }
    }
}
