package td02;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {
            System.out.println("Entrer un nombre pour la position " + i + " : ");
            myList.add(scanner.nextInt());
        }
        System.out.println("Ma liste : " + myList);

        myList.replaceAll(Math::abs);
        System.out.println("Ma liste corrigée : " + myList);

        System.out.println("Valeur la plus petite : " + myList.stream().min(Integer::compare).get());
        System.out.println("Position de la valeur la plus grande : " + myList.indexOf(myList.stream().max(Integer::compare).get()) + 1);

    }
}
