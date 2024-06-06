package td02;

import java.util.ArrayList;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {
            System.out.println("Entrer un nombre pour la position " + i + " : ");
            myList.add(scanner.nextInt());
        }

        System.out.println("Ma liste : " + myList);

        System.out.print("Valeurs paires : ");
        for(int n : myList) {
            if ((n % 2) == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        System.out.print("Valeurs supérieures à 20 : ");
        for(int n : myList) {
            if (n > 20) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        int sum = 0;
        for (int i : myList) {
            sum += i;
        }
        System.out.println("Somme des valeurs : " + sum);
    }
}
